package com.softtek.java.academy.exercises;



public class ConcatenarCadena{
	public static void main(String[] args){
		if(args!= null){
			if(args.length >=2){
				String CadenaA = args[0];
				String CadenaB = args[1];
				String CadenaConcatenada= CadenaA.concat(CadenaB).concat(CadenaB).concat(CadenaA);
				System.out.println(CadenaConcatenada);
			}else
				System.out.println("Favor de ingresar 2 o mas datos en consola ");
			
		}else
			System.out.println("Favor de ingresar datos en consola ");
		
	}
}