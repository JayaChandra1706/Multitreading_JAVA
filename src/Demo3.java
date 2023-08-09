
public class Demo3 implements Runnable{
	 public void run(){
	        try{
	    System.out.println("Multiplication activity started");
	    int a=3;
	    int b=6;
	    Thread.sleep(5000);
	    int c=a*b;
	    System.out.println(c);
	    System.out.println("Multiplication activity ended");
	        }
	        catch(Exception e){
	            e.printStackTrace();
	        }
	    }
}
