class CustomThread extends Thread{
	CustomThread(String name) {
		super(name);
		start();
	}
	public void run() {
		try {
			for(int loop_index = 0; loop_index < 4; loop_index++) {
				System.out.println((Thread.currentThread()).getName()+ " thread here...");
				Thread.sleep(1000);
			}
		} 
		catch (InterruptedException e) {}
		System.out.println((Thread.currentThread()).getName() + " ending.");
	}
}
class isAliveDemo{
	public static void main(String args[]) {
		CustomThread thread1 = new CustomThread("first");
		CustomThread thread2 = new CustomThread("second");
		CustomThread thread3 = new CustomThread("third");
		CustomThread thread4 = new CustomThread("fourth");
		System.out.println("Thread1 is alive- "+thread1.isAlive());
		try {
		thread1.join();
		thread2.join();
		thread3.join();
		thread3.join();
		}
		catch (InterruptedException e) {}
		System.out.println(thread1.isAlive());
	}
}