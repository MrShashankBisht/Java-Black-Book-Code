class NewThread implements Runnable{
	String Tn;
	Thread t;
	NewThread(String threadname){
		Tn = threadname;
		t = new Thread(this, Tn);
		System.out.println("New thread: " + t);
		t.start();
	}
	public void run() {
		try {
			for(int j = 75; j > 50; j--) {
			System.out.println(Tn + ": " + j);
			Thread.sleep(100);
			}
		}
		catch (InterruptedException e) {
			System.out.println(Tn + " breaking up...");
		}
		System.out.println(Tn + " finishing...");
	}
}
class Sleep {
	public static void main(String args[]) {
		NewThread ob1 = new NewThread("1");
		NewThread ob2 = new NewThread("2");
		try {
			Thread.sleep(1500);
			ob1.t.suspend();
			System.out.println("Thread 1's sleeping in progress");
			Thread.sleep(1500);
			ob1.t.resume();
			System.out.println("Waking up thread One");
			ob2.t.suspend();
			System.out.println("Thread 2 starting to sleep...");
			Thread.sleep(1500);
			ob2.t.resume();
			System.out.println("Thread Two, waking up...");
		}
		catch (InterruptedException e) {
			System.out.println("Main thread broken");
		}
		try {
			System.out.println("Waiting for threads to finish.");
			ob1.t.join();
			ob2.t.join();
		}
		catch (InterruptedException e) {
			System.out.println("Main thread broken");
		}
		System.out.println("Finishing Main thread");
	}
}