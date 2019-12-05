import java.util.List;
import java.util.ArrayList;

public class ThreadsTest {
	public static void main(String[] args) {
		List<String> Letras = new ArrayList<>();
		Letras.add("H");
		Letras.add("O");
		Letras.add("l");
		Letras.add("A");	
		
		try {
			for(String letra: Letras) {
				System.out.println(letra);
				if(letra.equals("X")) {
					Letras.remove(letra);
				}
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			Letras.clear();
		}

		System.out.println(Letras);
	}
}
