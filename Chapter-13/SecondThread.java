class SecondThread implements Runnable{
	Thread thread;
	SecondThread() {
		thread = new Thread(this, "second");
		System.out.println("Starting Child Thread.");
		thread.start();
	}
	public void run() {
		try {
			(Thread.currentThread()).setName("Child");
			for(int loop_index = 0; loop_index < 10; loop_index++) {
				System.out.println((Thread.currentThread()).getName()+ " thread here...\n");
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e) {}
		System.out.println("Second thread ending.");
	}
}
