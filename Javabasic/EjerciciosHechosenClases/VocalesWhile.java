public class VocalesWhile{
	public static void main(String[] args){
		String CadenaOriginal = args[0];
		
		int i=0;
		
			do{
				i++;
				if(CadenaOriginal.charAt(i) == 'A'){
					System.out.println("Esta plabra tiene vocales");
					
				}
				
			}while(i > CadenaOriginal.length());
			
	}
}