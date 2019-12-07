package Hilos;

public class ThreadExplae  implements Runnable{

	Thread t;
	String Nombre= null;
	
	
	public ThreadExplae(String nombre) {
		this.Nombre=nombre;
		t= new Thread(this,"Hilo");
		t.start();
	}
	@Override
	public void run() {
		for(int i =0; i<200; i++) {
			System.out.println(this.Nombre+" int i= "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
