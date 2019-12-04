package Collection1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class EjercicioList {
	Integer[] arraysTest = {1,4,5,6,7,8};
	//convertir arreglo en enteros en lista Integer 
	public static void main(String[] args) {
		Integer[] arraysTest = {1,4,5,6,7,8};
		List<Integer>NuevoarraysList = new ArrayList<>();
		
		for(int i=0;i<arraysTest.length;i++) {
			NuevoarraysList.add(arraysTest[i]);
		}
		
		for(Integer ag: NuevoarraysList) {
			System.out.println(ag);
		}
		
		
		
		
		
	}
	
	
}
