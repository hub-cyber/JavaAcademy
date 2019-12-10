package com.softtek.java.examen.programa4;

import java.util.Scanner;

public class programa4 {
	public static void main(String[] args) {
		Scanner lector= new Scanner(System.in);
		int[] arregloJ= new int[3];
		int [] arregloK= new int[3];
		int[]result = new int[2];
		
		for(int i=0; i<=arregloJ.length-1;i++) {
			System.out.println("Ingresar un numero entero para arreglo j: ");
			arregloJ[i]= lector.nextInt();
		}
		
		for(int k=0;k<=arregloK.length-1;k++) {
			System.out.println("Ingresar un numero entero para arreglo K: ");
			arregloK[k] = lector.nextInt();
			
		}
		
		for(int x=0; x<=arregloJ.length-1;x++) {
			for(int y=0;y<= arregloK.length-1; y++)
			if(x==1 && y==1) {
				System.out.println("{"+arregloJ[x]+" "+arregloK[y]+" }");
				
				
			}
		}
		
		
		
	}
}
