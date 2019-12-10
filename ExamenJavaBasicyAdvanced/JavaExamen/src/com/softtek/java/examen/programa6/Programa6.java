package com.softtek.java.examen.programa6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.softtek.java.examen.programa6.entity.Programa6State;

public class Programa6 {
	public static List<Programa6State> usuarios = new ArrayList<Programa6State>();
	public static void main(String[] args) throws SQLException {
		StringBuilder sql= new StringBuilder();
		sql.append("Select * from city");
		Connection conn= Programa6ConexionDB.getConnection();
		 Statement stm=conn.createStatement();
		
		try {
			ResultSet rs=stm.executeQuery(sql.toString());
			while(rs.next()) {
				Programa6State st= new Programa6State();
				st.setEstado_id(rs.getString("state_id"));
				st.setDescription(rs.getString("description"));
				st.setShipping_zone_id(rs.getString("shipping_zone_id"));
			   	usuarios.add(st);
            	System.out.println(usuarios);
			}
			  conn.close(); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	

	
}
