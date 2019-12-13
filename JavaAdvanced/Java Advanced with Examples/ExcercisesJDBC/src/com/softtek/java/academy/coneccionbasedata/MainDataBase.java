package com.softtek.java.academy.coneccionbasedata;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.softtek.java.academy.coneccionbasedata.Repository;
import com.softtek.java.academy.entities.*;


public class MainDataBase {
    public static List<User> usuarios = new ArrayList<User>();
	public static void main(String[] args) {
		try {
			Connection conn= ConexionDataBase.getConnection();
	            System.out.println(conn.getMetaData()
	                .getDatabaseProductName());
	            Repository user = new Repository();
	            User us = new User();
	            user.CapturarInfo(us);
	            user.CreateUser(us);
	            
	            
	            
	            
	            
	           
	            String sql = "select * from user";
	            Statement stm=conn.createStatement();
	            ResultSet rs= stm.executeQuery(sql.toString());
	            
	            while(rs.next()) {
	            	User usr = new User();
	            	usr.setUsername(rs.getString("username"));
	            	usr.setPassword(rs.getString("password"));
	            	usr.setName(rs.getString("name"));
	            	UserRole user_rol_id = new UserRole();
	            	user_rol_id.setUser_rolo_id(rs.getString("user_role_id"));
	            	usr.setActive(rs.getString("active"));
	            	usuarios.add(usr);
	            	System.out.println(usuarios);
	            }
	         
	            System.out.println(usuarios.size());
	            conn.close();   
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
