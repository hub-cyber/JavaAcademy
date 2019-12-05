package com.softtek.java.academy.exercises;
import java.lang.reflect.Array;
import java.util.Scanner;

/*Crear bun programa que acepte 10 nombres del usuarios a un array, crear un metodo que capture
 * y regrese este array:
 * Asignar los nombresw a una lista 
 * presentarlos en pantalla con un iterador 
 * sortear los nombres 
 * presentarlos en pantalla cpn un iterrrador 
 * Lanzar una excepcion custom si unoo de los nombres es nigres 
 * 
 *
 */



public class EjercicioJavaAdvanced {
	public static void main(String[] args) {
		String[] Nombres = new String[10];
		Scanner lector= new Scanner(System.in);
		
		for(int i=0;i<Nombres.length;i++) {
			System.out.println("Ingresa Nombre de algun Equipo de Futbol");
			String Equipo= lector.nextLine();
			Nombres[i]= Equipo;
			
		}
		System.out.println(Nombres);
	}
}
