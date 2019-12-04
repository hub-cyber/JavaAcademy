package com.softtek.java.academy.exercises;

import java.util.Scanner;

public class TwoStrings{
	public static void main(String[] args){
	Scanner lector= new Scanner(System.in);
	System.out.println("Ingresa valor del String:");
	String cadena1 = lector.nextLine();
	if(cadena1.length()>=2){
		System.out.println(cadena1.substring(0,2));
	}else if(cadena1.equals(""))
		System.out.println("Ingresaste una cadena vacia");
		else
			System.out.println(cadena1);
	}
	
}