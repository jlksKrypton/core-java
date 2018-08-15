package patterns.creational.singleton;

public class Main {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new  Runnable() {
			public void run() {
				oneobj a=oneobj.getobj();
			}
		});
		Thread t2 = new Thread(new  Runnable() {
			public void run() {
				oneobj b=oneobj.getobj();
			}
		});
		
		t1.start();
		//try {Thread.sleep(10);}catch (Exception e) {}
		t2.start();
			
	}
		
}
