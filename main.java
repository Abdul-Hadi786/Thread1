package test;

public class main {

	public static void main(String[] args) {
		EvenThread e = new EvenThread();
		OddThread o = new OddThread();
		
		e.start();
		o.start();

	}

}
