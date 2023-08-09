import java.util.Scanner;
public class Demo1 implements Runnable{
	public void run(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Banking activity started");
        System.out.println("Enter Accno");
        int accno=scan.nextInt();
        System.out.println("Enter pwd");
        int pwd=scan.nextInt();
        System.out.println("Banking activity ended");
    }
}
