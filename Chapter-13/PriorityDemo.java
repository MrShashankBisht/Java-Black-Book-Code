class Counter implements Runnable {
	Thread thread;
	int counter = 0;
	volatile boolean goflag;
	public Counter(int p) {
		thread = new Thread(this);
		thread.setPriority(p);
	}
	public void start() {
		goflag = true;
		thread.start();
	}
	public void run() {
		while (goflag) 
		counter++;
	}
	public void end() { goflag = false; }
}
class PriorityDemo {
	public static void main(String args[]) {
		Counter thread1 = new Counter(Thread.NORM_PRIORITY + 2);
		Counter thread2 = new Counter(Thread.NORM_PRIORITY + 1);
		Counter thread3 = new Counter(Thread.NORM_PRIORITY - 1);
		Counter thread4 = new Counter(Thread.NORM_PRIORITY - 2);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		try { Thread.sleep(5000); } 
		catch (InterruptedException e) {}
		thread1.end();
		thread2.end();
		thread3.end();
		thread4.end();
		System.out.println("Thread 1 counted: " + thread1.counter);
		System.out.println("Thread 2 counted: " + thread2.counter);
		System.out.println("Thread 3 counted: " + thread3.counter);
		System.out.println("Thread 4 counted: " + thread4.counter);
	}
}
