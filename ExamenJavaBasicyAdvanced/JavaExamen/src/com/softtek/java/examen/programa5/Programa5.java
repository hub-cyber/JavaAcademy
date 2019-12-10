package com.softtek.java.examen.programa5;

import java.util.Scanner;

import com.softtek.java.examen.programa5.interfaces.InterfaceProgram5;

public class Programa5 implements InterfaceProgram5 {
int Numero1,Numero2,ResultResta;
	
	public static void main(String[] args) {
		Programa5 Obj= new Programa5();
		
		Obj.CapturarNumeros();
		float D=Obj.dividir();
		int M=Obj.Multiplicar();
		int S= Obj.Sumar();
		Obj.Restar();
		Obj.ImprimirResultados(S,M,D);
	}
	
	
	
	
	@Override
	public void CapturarNumeros() {
		
		Scanner lector1= new Scanner(System.in);
		Scanner lector2= new Scanner(System.in);
		System.out.println("Ingresar el primer Numero:");
		Numero1= lector1.nextInt();
		System.out.println("Ingresar el Segundo Numero:");
		Numero2= lector2.nextInt();
	}

	@Override
	public Integer Sumar() {
		Integer ResultSuma= Numero1 + Numero2;
		return ResultSuma;
	}

	@Override
	public Integer Multiplicar() {
		Integer ResultMultiplicacion = Numero1*Numero2;
		return ResultMultiplicacion;
	}

	@Override
	public void Restar() {
		ResultResta= Numero1-Numero2;
		
	}

	@Override
	public float dividir() {
		float ResultDivision= Numero2/Numero1;
		return ResultDivision;
	}

	@Override
	public void ImprimirResultados(int Suma,int Mul, float Div) {
		System.out.println("La suma es:\n"+Suma);
		System.out.println("La Multiplicacion es:\n"+Mul);
		System.out.println("La Resta es:\n"+ResultResta);
		System.out.println("La Division es:\n"+Div);
		
	}
}
