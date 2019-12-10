package com.softtek.java.examen.programa6.entity;

public class Programa6State {
	private String estado_id;
	private String description;
	private String shipping_zone_id;
	
	
	public String getEstado_id() {
		return estado_id;
	}
	public void setEstado_id(String estado_id) {
		this.estado_id = estado_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getShipping_zone_id() {
		return shipping_zone_id;
	}
	public void setShipping_zone_id(String shipping_zone_id) {
		this.shipping_zone_id = shipping_zone_id;
	}
	
	@Override
	public String toString() {
		return "Programa6State [estado_id=" + estado_id + ", description=" + description + ", shipping_zone_id="
				+ shipping_zone_id + "]";
	}
	
	
}
