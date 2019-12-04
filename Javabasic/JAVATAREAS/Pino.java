package com.softtek.java.academy.exercises;
import java.util.Scanner;
public class Pino {
	public static void main(String[] args) {
		Scanner Renglones = new Scanner(System.in);
		System.out.println("Favor de ingresar la altura de su pino:");
		int Altura = Renglones.nextInt();
		String asterisco = "";
		String arreglo[]= new String[Altura];
		if(Altura >= 1 && Altura <= 10) {
			for(int i=0 ; i< Altura; i++) {
				asterisco += "*";
				arreglo[i]= asterisco;
			}
			for(int j= Altura-1; j>=0;j--){
				System.out.println(arreglo[j]);
			}
		}else
			System.out.print("Error; Favor de ingresar una altura mayor a 1 y no mayor a 10.");
		
	}
}
