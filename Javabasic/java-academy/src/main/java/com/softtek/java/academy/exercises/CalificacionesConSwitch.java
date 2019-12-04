
package com.softtek.java.academy.exercises;
import java.util.Scanner;
public class CalificacionesConSwitch{
	public static void main(String[] args){
		Scanner calificaciones = new Scanner(System.in);
		System.out.println("Ingresa Calificacion: ");
		
		int Calif = calificaciones.nextInt();
			switch(Calif){
				case 0: case 1: case 2: case 3: case 4:
				System.out.println("Suspenso ");
				break;
				case 5:
				System.out.println("Aprobado");
				break;
				case 6:
				System.out.println("Bien");
				break;
				case 7: case 8:
				System.out.println("Notable");
				break;
				case 9: case 10:
				System.out.println("Sobresaliente");
				break;
				default:
				System.out.println("Favor de ingresar una calificacion que este entre el 0 y 10");
			}
	}
}