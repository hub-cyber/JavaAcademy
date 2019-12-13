package com.softtek.academiaweb.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.softtek.academiaweb.config.ConexxionData;

import como.softtek.academia.web.model.State;

public class StateController {
	
	public static void main(String[] args) throws SQLException {
	
	}
	
	public List<State> getState() throws SQLException{
		// nueva instancia de conexxion 
		Connection conn = ConexxionData.getConnection();
		//query para obtener los estados 
		String sql= "Select*from";
		//lista final de todos los resultados de estado
		List<State> stateDB = new ArrayList<State>();
		//instrancia de statament 
		Statement stm = null; 
		
		//de la instancia de conexxion creara un statement
		stm=conn.createStatement();
		//ejecuta el statament con el querry indicado
		ResultSet rs= stm.executeQuery(sql);
		
		while (rs.next()) {
			State estados = new State();
			estados.setId(rs.getInt("state_id"));
			estados.setDescription(rs.getString("descriptcion"));
			stateDB.add(estados);
			
		}
		
		return stateDB;
		
	}

}
