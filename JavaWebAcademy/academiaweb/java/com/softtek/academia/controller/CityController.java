package com.softtek.academia.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.softtek.academia.web.model.City;
import com.softtek.academiaweb.conf.MyConnection;

public class CityController {
	
	public List<City> getCity(){
		//crear una conexion ala bd
		Connection conn= MyConnection.getConnection();
		//crear la sentencia sql 
		String sql= "Select * from city";
		//crear una lista para city 
		List<City> cities = new ArrayList<City>();
		//una instrancia statment
	    Statement stm= null;
		try {
			//Instancial nuestra coneccion con stamnet
			stm= conn.createStatement();
			//ejecutas el stament usando el result 
			ResultSet rs= stm.executeQuery(sql);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
