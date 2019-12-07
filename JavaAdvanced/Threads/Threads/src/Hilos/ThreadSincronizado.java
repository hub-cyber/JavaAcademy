package Hilos;

public class ThreadSincronizado {

	private int dias= 0;
	public static void main(String[] args) {
		//Crear una instancia 
		ThreadSincronizado th= new ThreadSincronizado();
		th.misDiasYear();
	}
	
	public void misDiasYear() {
		/*Hilos del dias buenos*/
		Thread t1= new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<30;i++) {
					diasBuenos();
				}
				
			}
			
		});
		
		//hilos del dia malo 
		
		//crear un hiolo 
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0; i<30;i++) {
					diasMalos();
				}
				
				
			}
			
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(dias);
	}
	
	

	public synchronized void diasMalos() {
		dias--;
		System.out.println("Dias malos = "+dias);
	}
	
	public synchronized void diasBuenos() {
		dias++;
		System.out.println("Dias buenos = "+dias);
	}
}
