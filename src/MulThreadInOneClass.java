import java.util.Scanner;
public class MulThreadInOneClass extends Thread{
	 Scanner scan=new Scanner(System.in);
	    public void run(){
	       if(getName().equals("bank")){
	             banking();
	       }else if(getName().equals("print")){
	             printing();
	       }else{
	             multiplication();
	       }
	    }
	    public void banking(){
	       System.out.println("Banking activity started");
	       System.out.println("Enter accno");
	       int accno=scan.nextInt();
	       System.out.println("Enter ped");
	       int pwd=scan.nextInt();
	       System.out.println("Banking activity ended");
	    }
	    public void printing(){
	        try{
	            System.out.println("Printing activity started");
	            for(int i=1;i<=5;i++){
	                System.out.println("JAYA CHANDRA");
	                Thread.sleep(5000);
	            }
	            System.out.println("Printing activity ended");
	        }
	        catch(Exception e){
	            e.printStackTrace();
	        }
	    }
	    public void multiplication(){
	        try{
	            System.out.println("Multiplication activity started");
	            int a=3;
	            int b=4;
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
