
public class Desborde {
	public static void main(String[] args) {
	
		boolean flagerror=false;
		try {
			int[] a = new int[10];
			a[6]=9;
		} catch (Exception e) {
			System.out.println(e);
			flagerror = true;
			
		}finally {
			System.out.println("Siempre se imprime");
			
		}
		
		System.out.println("Test");
	}
}
