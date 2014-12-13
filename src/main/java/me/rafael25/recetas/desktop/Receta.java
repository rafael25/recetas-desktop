/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.rafael25.recetas.desktop;

import java.util.Arrays;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author rafael
 */
public class Receta {
	private Integer id;
	private String nombre;
	private String descripcion;
	private String ingredientes;
	private String preparacion;
	private Integer tiempoPrep;
	private String rendimiento;
	private int[] categorias;
	private int[] imagenes;
	
	@JsonIgnore
	private Imagen img;
	
	public Receta() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getPreparacion() {
		return preparacion;
	}

	public void setPreparacion(String preparacion) {
		this.preparacion = preparacion;
	}

	public Integer getTiempoPrep() {
		return tiempoPrep;
	}

	public void setTiempoPrep(Integer tiempoPrep) {
		this.tiempoPrep = tiempoPrep;
	}

	public String getRendimiento() {
		return rendimiento;
	}

	public void setRendimiento(String rendimiento) {
		this.rendimiento = rendimiento;
	}

	public int[] getCategorias() {
		return categorias;
	}

	public void setCategorias(int[] categorias) {
		this.categorias = categorias;
	}

	public int[] getImagenes() {
		return imagenes;
	}

	public void setImagenes(int[] imagenes) {
		this.imagenes = imagenes;
	}
	
	public Imagen getImg() {
		return img;
	}

	public void setImg(Imagen img) {
		this.img = img;
	}
	
	@Override
	public String toString() {
		return "Receta{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", ingredientes=" + ingredientes + ", preparacion=" + preparacion + ", tiempoPrep=" + tiempoPrep + ", rendimiento=" + rendimiento + ", categorias=" + Arrays.toString(categorias) + ", imagenes=" + Arrays.toString(imagenes) + '}';
	}
}
