class RunnableDemo{
	public static void main(String args[]) {
		System.out.println("Starting Parent Thread.");
		SecondThread secondthread = new SecondThread();
		
		try {
			(Thread.currentThread()).setName("Parent");
			for(int loop_index = 0; loop_index < 10; loop_index++) {
				System.out.println((Thread.currentThread()).getName()+ " thread here...");
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e) {}
		System.out.println("Parent Thread Ending.");
	}
}
