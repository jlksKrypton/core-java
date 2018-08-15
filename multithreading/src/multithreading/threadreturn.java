package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class threadreturn {

	public static class threadReturn implements Callable<String> {

		@Override
		public String call() throws Exception {
			Thread.sleep(1000);// Doing some complex operations
			return Thread.currentThread().getName();
		}
	}

	public static void main(String[] args) {
		Callable c = new threadReturn();
		List<Future<String>> li = new ArrayList<Future<String>>();
		ExecutorService exe = Executors.newFixedThreadPool(20);

		for (int i = 1; i <= 100; i++) {
			Future<String> f = exe.submit(c);
			li.add(f);
		}
		for (Future<String> fu : li) {
			try {
				System.out.println(fu.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		exe.shutdown();
	}

}
