package com.softtek.java.examen.programa7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class programa7 implements Programa7MapaInterface{

	public static void main(String[] args) {
		programa7 personaje = new programa7();
		Scanner lector= new Scanner(System.in);
		System.out.println("Ingresa el Id  del Personaje a buscar:");
		String llave = lector.nextLine();
		personaje.obtenerPersonaje(llave);
	}

	@Override
	public void obtenerPersonaje(String llave) {
		try {
			FileWriter fw= new FileWriter("C:/Users/Usuario/Documents/GitHub/JavaAcademy-CMA/ExamenJavaBasicyAdvanced/"
												+ "JavaExamen/src/com/softtek/java/"
													+ "examen/programa7/Personaje.txt");
			PrintWriter salida = new PrintWriter(fw);
			
			Map<String,String>PersonajeMap = new HashMap<String,String>();
			PersonajeMap.put("a1234", "Stave Job");
			PersonajeMap.put("a1235", "Scott McNealy");
			PersonajeMap.put("a1236", "Jeff Bezos");
			PersonajeMap.put("a1237", "Larrry Ellison");
			PersonajeMap.put("a1238", "Bill Gates");
			salida.print(llave + " "+PersonajeMap.get(llave));
			salida.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}


}
