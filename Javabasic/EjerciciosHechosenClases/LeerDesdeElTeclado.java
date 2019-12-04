import java.util.Scanner;

public class LeerDesdeElTeclado{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		System.out.println("Cual es tu Nombre:");
		String Nombre = lector.nextLine();
		System.out.println("Hola "+Nombre+" Buen dia!");
	}
}