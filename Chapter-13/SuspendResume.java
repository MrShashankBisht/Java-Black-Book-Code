class NewThread implements Runnable{
	String SR; 
	Thread h;
	boolean counter;
	NewThread(String threadname) {
		SR = threadname;
		h = new Thread(this, SR);
		System.out.println("Begin thread: " + h);
		counter = false;
		h.start(); 
	}
	public void run() {
		try {
			for(int i = 30; i > 15; i--) {
				System.out.println(SR + ": " + i);
				Thread.sleep(200);
				synchronized(this) {
					while(counter) {
						wait();
					}
				}
			}
		}
		catch (InterruptedException e) {
			System.out.println(SR + " Suspended...");
		}
		System.out.println(SR + " Ending...");
	}
	void mysuspend() {
		counter = true;
	}
	synchronized void myresume() {
		counter = false;
		notify();
	}
}
class SuspendResume{
	public static void main(String args[]) {
		NewThread ob1 = new NewThread("One");
		NewThread ob2 = new NewThread("Two");
		try {
			Thread.sleep(1000);
			ob1.mysuspend();
			System.out.println("Suspending One...");
			Thread.sleep(1000);
			ob1.myresume();
			System.out.println("Resuming One...");
			ob2.mysuspend();
			System.out.println("Suspending Two...");
			Thread.sleep(1000);
			ob2.myresume();
			System.out.println("Resuming Two...");
		}
		catch (InterruptedException e) {
			System.out.println("Main thread Suspended...");
		}
		try {
			System.out.println("Waiting for threads to finish.");
			ob1.h.join();
			ob2.h.join();
		}
		catch (InterruptedException e) {
		System.out.println("Main thread Suspended");
		}
		System.out.println("Main thread exiting...");
	}
}
