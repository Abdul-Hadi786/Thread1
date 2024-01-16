package test;

public class OddThread extends Thread {
	public synchronized void run() {
		for(int i = 0; i<20; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
}
