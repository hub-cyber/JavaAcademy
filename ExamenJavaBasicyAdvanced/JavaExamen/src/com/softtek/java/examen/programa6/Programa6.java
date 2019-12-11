package com.softtek.java.examen.programa6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.softtek.java.examen.programa6.entity.Programa6State;

public class Programa6 {
	public static List<Programa6State> estados = new ArrayList<Programa6State>();

	public static void main(String[] args) throws SQLException, IOException {

		StringBuilder sql = new StringBuilder();
		sql.append("Select * from state");
		Connection conn = Programa6ConexionDB.getConnection();
		Statement stm = conn.createStatement();
		FileWriter fw = new FileWriter("C:/Users/Usuario/Documents/GitHub/JavaAcademy-CMA/"
				+ "ExamenJavaBasicyAdvanced/JavaExamen/src/com/softtek/java/examen/programa6/" + "Estados.txt");
		PrintWriter salida = new PrintWriter(fw);

		try {
			ResultSet rs = stm.executeQuery(sql.toString());
			while (rs.next()) {
				Programa6State st = new Programa6State();
				st.setEstado_id(rs.getString("state_id"));
				st.setDescription(rs.getString("description"));
				st.setShipping_zone_id(rs.getString("shipping_zone_id"));
				estados.add(st);
			}
			Iterator<Programa6State> it = estados.iterator();
			while (it.hasNext()) {
				salida.println(it.next());
			}
			salida.flush();

			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
