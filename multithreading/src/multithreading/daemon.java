package multithreading;

public class daemon {

    public static void main(String[] args) {
        new WorkerThread(true,"daemon").start();
        //new WorkerThread(false,"normal").start();
        try {
            Thread.sleep(7500);
        } catch (InterruptedException e) {
            // handle here exception
        }

        System.out.println("Main Thread ending") ;
    }

}

class WorkerThread extends Thread {

	String abc;
    public WorkerThread(boolean b,String type) {
        // When false, (i.e. when it's a user thread),
        // the Worker thread continues to run.
        // When true, (i.e. when it's a daemon thread),
        // the Worker thread terminates when the main 
        // thread terminates.
        setDaemon(b); 
        abc=type;
    }

    @Override
    public void run() {
        int count = 0;

        while (true) {
            System.out.println("Hello from "+ abc +" "+count++);

            try {
                sleep(5000);
            } catch (InterruptedException e) {
                // handle exception here
            }
        }
    }
}

