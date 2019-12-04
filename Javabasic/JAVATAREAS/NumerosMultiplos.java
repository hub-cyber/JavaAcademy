import java.util.Scanner;
public  class NumerosMultiplos{
    public static void main(String[]args){
        Scanner lector1= new Scanner(System.in);
        Scanner lector2= new Scanner(System.in);
        Scanner lector3= new Scanner(System.in);
        System.out.println("Ingresa la cantidad de numeros a ulizar:");
        int Number = lector1.nextInt();
        System.out.println("Ingresa el valor del Primer Multiplo a Buscar:");
        int NumberMultiplo1= lector2.nextInt();
        System.out.println("Ingresa el valor del Segundo Multiplo a Buscar:");
        int NumberMultiplo2= lector3.nextInt();

        int resultMultiplo1=0;
        int resultMultiplo2=0;
        int resultSum;

        for(int i=1;i<Number; i++){
            if( i % NumberMultiplo1==0){
                resultMultiplo1+=i;
            }
        }

        for(int j=1; j<Number;j++){
            if(j%NumberMultiplo2==0){
                resultMultiplo2+=j;
            }
        }
        resultSum= resultMultiplo1+resultMultiplo2;
        System.out.println("La suma total de todos los valores de los multimplos de "+NumberMultiplo1+" y "+NumberMultiplo2+" es:\n"+resultSum);
    }
}