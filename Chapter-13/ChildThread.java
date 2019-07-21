class ChildThread extends Thread{
	ChildThread(){
		super("Child");
		start();
	}
	public void run() {
		try {
			System.out.println("Child Thread Started.");
			for(int loop_index = 0; loop_index < 10; loop_index++){
				System.out.println((Thread.currentThread()).getName()+ " thread here...");
				Thread.sleep(1000);
			}
		} 
		catch (InterruptedException e) {}
		System.out.println("Child Thread Ended.");
	}
}