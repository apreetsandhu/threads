package midterm_Anmolpreet;

public class ThreadOne extends Thread {
	
	public void MyThreadOne() {
		
	}
	
	
	public void run(){
        for(int i=50;i >= 1;i--) {

        	try {
        		Thread.sleep(300);
        	}
        	catch(InterruptedException ex) {
        		System.out.println("ThreadOne has been interuppted");
        		return;
        	}
        	//finally{
	        		if(i % 5 == 0) {
	        			System.out.println(" ");
	        		}
	        		System.out.print(i + "\t");
        		//}
            
        }
    }
}
