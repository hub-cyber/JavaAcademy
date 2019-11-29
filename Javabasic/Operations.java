import java.util.Scanner;

public class Operations{
	public static void main(String[] args){
		Scanner Valor1 = new Scanner(System.in);
		Scanner Valor2 = new Scanner(System.in);
		int sum=0,resta=0,multiplicacion= 0;
		float div= 0f;
		System.out.println("Ingresa el Primer Numero:");
		int Numero1 = Valor1.nextInt();
		System.out.println("Ingresa el Primer Numero:");
		int Numero2 = Valor1.nextInt();
		
		// suma 
		sum = Numero1+Numero2;
		System.out.println("El resultado de la suma es: "+sum);
		//resta
		resta = Numero1-Numero2;
		System.out.println("El resultado de la resta es: "+resta);
		//multiplicacion
		multiplicacion = Numero1*Numero2;
		System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
		//division
		div = (Numero1/Numero2);
		System.out.println("El resultado de la division es: "+div);
	}
}