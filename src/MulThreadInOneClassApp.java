
public class MulThreadInOneClassApp {
	 public static void main(String[] args) {
		    MulThreadInOneClass m1=new MulThreadInOneClass();
		    MulThreadInOneClass m2=new MulThreadInOneClass();
		    MulThreadInOneClass m3=new MulThreadInOneClass();
		    m1.setName("bank");
		    m2.setName("print");
		    m3.setName("mul");
		    m1.start();
		    m2.start();
		    m3.start();
		    }
}
