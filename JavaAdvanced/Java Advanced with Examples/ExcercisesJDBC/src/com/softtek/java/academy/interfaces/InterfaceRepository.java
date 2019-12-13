package com.softtek.java.academy.interfaces;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.softtek.java.academy.entities.User;

public interface InterfaceRepository {
	
	public void CapturarInfo(User us);
	public void CreateUser(User us);
	public String getUserByUsername(User us);
	public void deleteUserByUsername(User us);
	public User getAllUsers(User us);
	public void close(PreparedStatement pstm,Connection conn);
	
}
