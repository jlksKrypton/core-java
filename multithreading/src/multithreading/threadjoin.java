package multithreading;
import java.lang.Thread;

public class threadjoin {
	
	public static void main(String[] args) throws InterruptedException {
	
		Thread t1=new Thread(() ->
		{
			System.out.println(Thread.currentThread().getName()+" started");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()+" ended");
		},"t1");
		t1.start();
		t1.join(2000);
		Thread t2=new Thread(() ->
		{
			System.out.println(Thread.currentThread().getName()+" started");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e1) {}
			System.out.println(Thread.currentThread().getName()+" ended");
		},"t2");
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {}
		
		Thread t3=new Thread(() ->
		{
			System.out.println(Thread.currentThread().getName()+" started");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()+" ended");
		},"t3");
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		System.out.println("All threads are done");
		Thread t4=new Thread();
	}
}
