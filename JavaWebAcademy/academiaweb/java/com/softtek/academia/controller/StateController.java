package com.softtek.academia.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.softtek.academia.web.model.State;
import com.softtek.academiaweb.conf.MyConnection;

public class StateController {
	
	public static void main(String[] args) {
		StateController controller = new StateController();
		List<State> states = controller.getStates();
		
		for(State s : states) {
			System.out.println(s.getDescription());
		}
	}

	public List<State> getStates(){
		
		// nueva instancia de la conexion
		Connection connection = MyConnection.getConnection();
		
		// query para obtener los estados (states)
		String sqlQuery = "SELECT * FROM state";
		
		// lista final de todos los estados 
		List<State> statesDB = new ArrayList<State>();
		
		// instancia del statment
		Statement stmt = null;

		try {
			
			//de la instancia de conexion crea un statement.
			stmt = connection.createStatement();
			
			// ejecuta el statement con el query indicado.
		    ResultSet rs = stmt.executeQuery(sqlQuery);
		    
		    // loop para leer los resultados de la consulta.
		    while(rs.next()) {
		    	
		    	State estado = new State();
		    	estado.setDescription(rs.getString("description"));
		    	estado.setId(rs.getInt("state_id"));
		    	
		    	statesDB.add(estado);
		    	
		    	
		    }

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return statesDB;
	}
	
	
	
	
	
	
	
	
	

}
