class CreateThreadDemo{
	public static void main(String args[]){
		new NewThread(); 	// create a new thread
		try {
			for(int k = 10; k > 6; k--){
				System.out.println("Parent Thread: " + k);
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e){
			System.out.println("Parent Interrupted.");
		}
		System.out.println("Exiting Parent.");
	}
}
class NewThread implements Runnable{
	Thread T;
	NewThread(){
		//a new, second thread
		T = new Thread(this, "Creating Thread");
		System.out.println("Thread of child: " + T);
		T.start();		// Start the thread
	}
	// Point of entry for the second thread.
	public void run(){
		try {
			for(int j = 10; j > 6; j--){
			System.out.println("Child Thread: " + j);
			Thread.sleep(500);
			}
		}
		catch (InterruptedException e){
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting Child.");
	}
}