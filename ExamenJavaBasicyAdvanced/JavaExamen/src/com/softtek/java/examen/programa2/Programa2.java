package com.softtek.java.examen.programa2;

import java.util.Scanner;

public class Programa2 {
	public static void main(String[] args) {
		Scanner lector= new Scanner(System.in);
		Scanner lector2= new Scanner(System.in);
		System.out.println("Ingresar un numero entero: ");
		int Numero1 = lector.nextInt();
		System.out.println("Ingresar un segundo entero: ");
		int Numero2 = lector.nextInt();
		
		if(Numero1 >0 && Numero2>0) {
			if(Numero1<21 ) {
				System.out.println(Numero1);
			}else if(Numero2<21) {
					System.out.println(Numero2);
			}else 
				System.out.println("0");
		}
	
		
		
	}
}
