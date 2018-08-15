package multithreading;
import java.lang.Thread;
public class threadtypes {
	
	public static class extendthread extends Thread{

		String name;
		public extendthread(String name) {
			super();
			this.name = name;
		}

		@Override
		public void run() {
			try {
				System.out.println("extendThread : "+name+" Started");
				doDB();
				System.out.println("extendThread : "+name+" Ended");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		void doDB() throws InterruptedException
		{
			Thread.sleep(5000);
		}
	}
	
	public static class implementsthread implements Runnable{


		@Override
		public void run() {
			try {
				System.out.println("implementsThread : "+Thread.currentThread().getName()+" Started");
				doDB();
				System.out.println("implementsThread : "+Thread.currentThread().getName()+" Ended");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		void doDB() throws InterruptedException
		{
			Thread.sleep(5000);
		}
	}
	
	public static void main(String[] args) {
		
		Thread t1=new extendthread("t1");
		t1.start();
		Thread t2=new extendthread("t2");
		t2.start();
		Thread t3=new Thread(new implementsthread(),"t3");
		t3.start();
		Thread t4=new Thread(new implementsthread(),"t4");
		t4.start();
	}

}
