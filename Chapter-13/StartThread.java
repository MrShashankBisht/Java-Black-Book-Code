class NewThread implements Runnable{
	String name; 
	Thread t;
	NewThread(String threadname) {
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start(); 
	}
	public void run() {
		try {
			for(int i = 100; i > 95; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		} 
		catch (InterruptedException e) {
			System.out.println(name + "Interrupted");
		}
		System.out.println(name + " exiting.");
	}
}
class StartThread{
	public static void main(String args[]) {
		new NewThread("1:"); 
		new NewThread("2:");
		new NewThread("3:");
		try {
			Thread.sleep(10000);
		} 
		catch (InterruptedException e) {
			System.out.println("Parent thread Interrupted");
		}
		System.out.println("Parent thread exiting.");
	}
}
