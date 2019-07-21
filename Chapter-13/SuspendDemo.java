class CustomThread extends Thread{
	volatile boolean goFlag = true;
	CustomThread(String name) {
		super(name);
		start();
	}
	public void run() {
		try {
		for(int loop_index = 0; loop_index <= 5; loop_index++) {
			System.out.println(Thread.currentThread().getName() + "here...");
			Thread.sleep(500);
			synchronized(this) {
				while(!goFlag) {
					wait();
				}
			}
		}
		} 
		catch (InterruptedException e) {}
	}
	public void newSuspend() {
		goFlag = false;
	}
	synchronized public void newResume() {
		goFlag = true;
		notify();
	}
}
class SuspendDemo{
	public static void main(String args[]) {
		CustomThread thread1 = new CustomThread("one");
		CustomThread thread2 = new CustomThread("two");
			try {
				Thread.sleep(1000);
				System.out.println("Suspending thread one...");
				thread1.newSuspend();
				Thread.sleep(1000);
				System.out.println("Resuming thread one...");
				thread1.newResume();
			} 
			catch (InterruptedException e) {}
			try {
				thread1.join();
				thread2.join();
			} 
			catch (InterruptedException e) {}
		}
	}
