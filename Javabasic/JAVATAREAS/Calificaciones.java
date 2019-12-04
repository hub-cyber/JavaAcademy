import java.util.Scanner;

public class Calificaciones{
	public static void main(String[] args){
		Scanner calificaciones = new Scanner(System.in);
		System.out.println("Ingresa Calificacion: ");
		
		int Calif = calificaciones.nextInt();
		if(Calif>0 && Calif<10){
			if(Calif >=0 && Calif <=4)
			System.out.println("Suspenso ");
			else if(Calif == 5)
			System.out.println("Aprobado");
			else if(Calif == 6)
			System.out.println("Bien");
			else if(Calif >=7 && Calif <=8)
			System.out.println("Notable");
			else /*if(Calif >=9 && Calif <=10);*/
			System.out.println("Sobresaliente");
		}else{
			System.out.println("Favor de ingresar una calificacion que este entre el 0 y 10");
		}
		
		
		
	}
}