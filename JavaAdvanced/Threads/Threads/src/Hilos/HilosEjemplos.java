package Hilos;

public class HilosEjemplos extends Thread {
	public HilosEjemplos(String str) {
		super(str);
	}
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i+" "+getName());
			try {
				sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		System.out.println("Done"+getName());
	}
}
