package midterm_Anmolpreet;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		//for question one and two->>>
		/*
		(new Thread (new ThreadOne())).start();
		(new Thread (new ThreadTwo())).start();
		*/
		
		//for question #three
		ThreadOne Th1 = new ThreadOne();
		ThreadTwo Th2 = new ThreadTwo();
		
		Th1.start();
		try {
			Th1.join();  // wait here till finish
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Th2.start();
		

	}

}
