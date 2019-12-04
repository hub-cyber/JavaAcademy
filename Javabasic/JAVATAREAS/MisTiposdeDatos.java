public class MisTiposdeDatos{
	public static void main(String[] args){
	//Tipos nombreVariable; <opcional inicializacion>
	int edad=18;
	short peso= 70;
	String nombre ="Carlos";
	float precio= 135.5f;
	boolean esVip = false;
	boolean tieneCredencial = false;
	boolean puedoVotar = ((edad >=18) && tieneCredencial );
	
	System.out.println("Mi Nombre es: "+nombre+"\n" + "Mi edad es: "+edad+ "\n" + "Mi peso es: "+peso+ "\n" + "Y mi precio es:"+
	precio+ "\n"+"Soy VIP?: "+esVip+ "\n"+"Tengo Credencial: "+tieneCredencial+ "\n"+"Puedo Votar: "+puedoVotar);
	
	}

}