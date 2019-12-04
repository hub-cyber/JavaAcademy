package com.softtek.java.academy.exercises;

public class PareImpar{
	public static void main(String[] args){
		int Number= Integer.parseInt(args[0]);
		if((Number%2==0)){
			if(Number >0)
				System.out.print("Es par y es un numero positivo");
			else
				System.out.println("Es par y es un numero negativo");
			
		}else{
			if(Number>0)
				System.out.println("Es impar y es un numero positivo");
			else
				System.out.println("Es impar y es un numero negativo");
			
		}
	}
}