/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.rafael25.recetas.desktop;

import java.io.InputStream;
import java.net.URL;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;

/**
 *
 * @author rafael
 */
public class RecetasAsyncLoader implements Runnable {
	Almacen almacen;
	
	public RecetasAsyncLoader(Almacen almacen) {
		this.almacen = almacen;
	}

	@Override
	public void run() {
		this.almacen.setIsLoadin(true);
		String url = "http://api.rafael25.me/api/recetas";
		try {
			InputStream response = new URL(url).openStream();
			ObjectMapper mapper = new ObjectMapper();
			
			JsonNode jnode = mapper.readValue(response, JsonNode.class);
			ArrayNode recetas = mapper.readValue(jnode.get("recetas"), ArrayNode.class);
			ArrayNode imagenes = mapper.readValue(jnode.get("imagenes"), ArrayNode.class);
			
			for (JsonNode node : recetas) {
				Receta r = mapper.readValue(node, Receta.class);
				this.almacen.addReceta(r);
			}
			
			for (JsonNode node : imagenes) {
				Imagen i = mapper.readValue(node, Imagen.class);
				this.almacen.addImagen(i);
			}
			this.almacen.setIsLoadin(false);
		} catch (Exception e) {
			this.almacen.setIsLoadin(false);
			e.printStackTrace();
		}
	}
	
}
