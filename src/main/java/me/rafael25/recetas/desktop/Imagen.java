/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.rafael25.recetas.desktop;

/**
 *
 * @author rafael
 */
public class Imagen {
	private Integer id;
	private String url;
	private String receta;
	
	public Imagen() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getReceta() {
		return receta;
	}

	public void setReceta(String receta) {
		this.receta = receta;
	}

	@Override
	public String toString() {
		return "Imagen{" + "id=" + id + ", url=" + url + ", receta=" + receta + '}';
	}
}
