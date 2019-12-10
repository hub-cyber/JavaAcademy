package com.softtek.java.examen.programa1;

import java.util.Scanner;

public class Programa1 {
	public static void main(String[] args) {
		
		Scanner lector= new Scanner(System.in);
		System.out.println("Ingresar un numero entero: ");
		int Numero = lector.nextInt();
		int result=0;
		if(Numero >=2 && Numero <=20) {
			for(int i= 1; i<=10; i++) {
				result= Numero * i;
				System.out.println(Numero +" X "+i+" = "+ result);
			}
		}else
			System.out.println("Valor no aceptado favor de ingresar valor entre 2 y 20");
	}
}
