
public class Demo2 implements Runnable{
	 public void run(){
	       try{
	        System.out.println("Printing activity Started");
	        for(int i=1;i<=5;i++){
	            System.out.println("JAYA");
	            Thread.sleep(5000);
	        }
	        System.out.println("Printing activity ended");
	    
	       } 
	       catch(Exception e){
	         e.printStackTrace();
	       }
	    }
}
