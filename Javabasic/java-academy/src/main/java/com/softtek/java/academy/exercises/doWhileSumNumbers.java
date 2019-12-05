package com.softtek.java.academy.exercises;
import java.util.Scanner;
public class doWhileSumNumbers{
    public static void main(String[]args){
        Scanner scanner1= new Scanner(System.in);
        Scanner scanner2= new Scanner(System.in);
        Scanner scanner3= new Scanner(System.in);
        int resultSum;
        int controlador;
        do{
            System.out.println("Ingresa el Primer Numero a Sumar:");
            int Number = scanner2.nextInt();
            System.out.println("Ingresa el Segundo Numero a Sumar:");
            int Number2= scanner2.nextInt();
            resultSum= Number+Number2;
            System.out.println("EL suma de los dos numeros ingresados es:\n"+resultSum);

            System.out.println("Quieres realizar otra suma? NO(0) SI(1)");
              controlador = scanner3.nextInt();

        }while(controlador==1);
      
    }
}