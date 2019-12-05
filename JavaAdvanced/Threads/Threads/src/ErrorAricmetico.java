
public class ErrorAricmetico {
	public static void main(String[] args) {
		int num1= 30;
		int num2=0;
		int output = num1/num2;
		
		try {
			System.out.println(output);
		} catch (ArithmeticException e) {
			System.out.println("Division entre cero da a infinito"+ e);
		}
		
		
	}
}
