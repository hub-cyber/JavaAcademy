package Collection1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.
public class Agenda {
	private Integer id;
	private String nombre;
	private String email;
	private String telefono;
	

	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public static void main(String[] args) {
		Agenda a= new Agenda();
		a.setId(1);
		a.setNombre("Adrian");
		a.setEmail("adrian@softtek.com");
		a.setTelefono("8326546546");
		
		Agenda b= new Agenda();
		b.setId(2);
		b.setNombre("Carlos");
		b.setEmail("carlos@softtek.com");
		b.setTelefono("83896556");
		
		
		
		for(Agenda ag: agendaList) {
			System.out.println(ag.getNombre());
		}
		
		System.out.println("----------------");
		
		for(int i=0; i< agendaList.size(); i++) {
			System.out.println(agendaList.get(i).getNombre());
		}
		
	}
}
