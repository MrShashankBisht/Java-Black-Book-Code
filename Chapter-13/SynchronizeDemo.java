class SynchronizeDemo{
	public static void main(String args[]) {
		Shared shared = new Shared();
		CustomThread thread1 = new CustomThread(shared, "one");
		CustomThread thread2 = new CustomThread(shared, "two");
		CustomThread thread3 = new CustomThread(shared, "three");
		CustomThread thread4 = new CustomThread(shared, "four");
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
		} 
		catch(InterruptedException e) {}
	}
}

class CustomThread extends Thread {
	Shared shared;
	public CustomThread(Shared shared, String string) {
		super(string);
		this.shared = shared;
		start();
	}
	public void run() {
		shared.doWork(Thread.currentThread().getName());
	}
}
class Shared{
	void doWork(String string) {
		System.out.println("Starting " + string);
		try {
			Thread.sleep((long) (Math.random() * 500));
		} 
		catch (InterruptedException e) {}
		System.out.println("Ending " + string);
	}
}

