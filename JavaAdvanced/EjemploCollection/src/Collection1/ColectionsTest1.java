package Collection1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColectionsTest1 {
	public static void main(String[] args) {
		List<String> letras= new ArrayList<>();
		String nombre = "S,o,f,t,t,e,k";
		letras.addAll(Arrays.asList(nombre.split(",")));
		letras.remove("k");
		List<String> remover= new ArrayList<>();
		remover.add("t");
		letras.removeAll(remover);
		for(String letra: letras) {
			System.out.println(letra);
			if(letra.contains("s")) {
				letras.remove(letra);
				break;
			}
		}
		
		List<String> nombres= new ArrayList<>();
	}

}
