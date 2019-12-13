package como.softtek.academia.web.model;

public class City {
	private Integer id;
	private String description;
	private State state_id;
	
	

	
	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public State getState_id() {
		return state_id;
	}




	public void setState_id(State state_id) {
		this.state_id = state_id;
	}




	@Override
	public String toString() {
		return "City [id=" + id + ", description=" + description + ", state_id=" + state_id + "]";
	}
	
	
}
