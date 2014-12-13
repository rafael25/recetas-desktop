/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.rafael25.recetas.desktop;

import java.util.ArrayList;

/**
 *
 * @author rafael
 */
public class Almacen {
	private ArrayList<Receta> recetasList;
	private ArrayList<Imagen> imagenesList;
	private boolean isLoadin;

	public Almacen() {
		this.recetasList = new ArrayList<>();
		this.imagenesList = new ArrayList<>();
	}

	public ArrayList<Receta> getRecetasList() {
		return recetasList;
	}

	public ArrayList<Imagen> getImagenesList() {
		return imagenesList;
	}
	
	public void addReceta(Receta r) {
		this.recetasList.add(r);
	}
	
	public void addImagen(Imagen i) {
		this.imagenesList.add(i);
	}

	public boolean isIsLoadin() {
		return isLoadin;
	}

	public void setIsLoadin(boolean isLoadin) {
		this.isLoadin = isLoadin;
	}

	@Override
	public String toString() {
		return "Almacen{" + "recetasList=" + recetasList + ", imagenesList=" + imagenesList + ", isLoadin=" + isLoadin + '}';
	}
}
