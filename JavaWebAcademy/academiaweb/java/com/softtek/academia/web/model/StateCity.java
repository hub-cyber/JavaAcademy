package com.softtek.academia.web.model;

public class StateCity {
	private City id_city;
	private City description_city;
	private State state_id;
	private State descriptionState;
	
	
	public City getId_city() {
		return id_city;
	}
	public void setId_city(City id_city) {
		this.id_city = id_city;
	}
	public City getDescription_city() {
		return description_city;
	}
	public void setDescription_city(City description_city) {
		this.description_city = description_city;
	}
	public State getState_id() {
		return state_id;
	}
	public void setState_id(State state_id) {
		this.state_id = state_id;
	}
	public State getDescriptionState() {
		return descriptionState;
	}
	
	public void setDescriptionState(State descriptionState) {
		this.descriptionState = descriptionState;
	}
	@Override
	public String toString() {
		return "StateCity [id_city=" + id_city + ", description_city=" + description_city + ", state_id=" + state_id
				+ ", descriptionState=" + descriptionState + "]";
	}
	
	
	
}
