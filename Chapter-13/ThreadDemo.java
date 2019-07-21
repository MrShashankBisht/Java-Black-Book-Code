class ThreadDemo{
	public static void main(String args[]) {
		ChildThread childthread = new ChildThread();
		try {
		for(int loop_index = 0; loop_index < 10; loop_index++) {
			System.out.println((Thread.currentThread()).getName()+ " thread here...");
			Thread.sleep(1000);
		}
	} 
	catch (InterruptedException e) {}
	}
}