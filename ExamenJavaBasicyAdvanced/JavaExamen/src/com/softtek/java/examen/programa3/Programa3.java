package com.softtek.java.examen.programa3;

import java.util.Scanner;

public class Programa3 {
	public static void main(String[] args) {
		Scanner lector= new Scanner(System.in);
		System.out.println("Ingresar una Palabra: ");
		String cadena = lector.nextLine();
		String cadenaareves="";
		
		for(int i= cadena.length()-1;i>=0;i--) {
			cadenaareves+= cadena.charAt(i);
		}
		
		if(cadenaareves.equals(cadena)) {
			System.out.println("si");
		}else
			System.out.println("no");
			
		
		
	}
}
