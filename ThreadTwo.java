package midterm_Anmolpreet;

public class ThreadTwo extends Thread {
	public void run(){
        for(int i=25;i >= 0;i--) {
        	
        	try {
        		Thread.sleep(300);
        	}
        	catch(InterruptedException ex) {
        		System.out.println("ThreadTwo has been interuppted");
        		return;
        	}
        	
        	if(i % 5 == 0) {
    			System.out.println(" ");
    		}
        	System.out.print((char)(i + 65) + "\t");
        		
        	
        }
    }

}
