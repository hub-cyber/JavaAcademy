package com.softtek.java.academy.coneccionbasedata;

import com.softtek.java.academy.entities.User;
import com.softtek.java.academy.entities.UserRole;
import com.softtek.java.academy.interfaces.InterfaceRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.softtek.java.academy.coneccionbasedata.ConexionDataBase;;
public class Repository implements InterfaceRepository{

	@Override
	public void CapturarInfo(User us) {
		Scanner Valor1= new Scanner(System.in);
		Scanner Valor2= new Scanner(System.in);
		Scanner Valor3= new Scanner(System.in);
		Scanner Valor4= new Scanner(System.in);
		Scanner Valor5= new Scanner(System.in);
		
		System.out.println("Ingresa username:");
		us.setUsername(Valor1.nextLine());
		System.out.println("Ingresa password:");
		us.setPassword(Valor2.nextLine());
		System.out.println("Ingresa name:");
		us.setName(Valor3.nextLine());
		System.out.println("Ingresa Rol:");
		us.setUser_role_id( Valor4.nextLine());
		System.out.println("Ingresa Status:");
		us.setActive(Valor5.nextLine());
	}
	
	@Override
	public void CreateUser(User us) {
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO user (username,password,name,user_role_id,active)"+
		"VALUES (?,?,?,?,?)");
		Connection conn= ConexionDataBase.getConnection();
		PreparedStatement pstm= null;
		try {
			pstm= conn.prepareStatement(sql.toString());
			pstm.setString(1,us.getUsername());
			pstm.setString(2,us.getPassword());
			pstm.setString(3,us.getName());
			pstm.setString(4,us.getUser_role_id());
			pstm.setString(5,us.getActive());
			pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			this.close(pstm,conn);
		}
	}

	@Override
	public String getUserByUsername(User us) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserByUsername(User us) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getAllUsers(User us) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close(PreparedStatement pstm, Connection conn) {
		if(pstm !=null && conn !=null) {
			try {
				if(!pstm.isClosed() || !conn.isClosed()) {
					pstm.close();
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}




}
