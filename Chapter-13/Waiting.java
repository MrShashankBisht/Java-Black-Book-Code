class Shared{
	int data = 0;
	synchronized void doWork(){
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}
		data = 1;
		notify();
	}
	synchronized int getResult() {
		try {
			wait();
		} catch(InterruptedException e) {}
		return data;
	}
}

class CustomThread1 extends Thread{
	Shared shared;
	public CustomThread1 (Shared shared, String string){
		super(string);
		this.shared = shared;
		start();
	}
	public void run() {
		System.out.println("The result is " + shared.getResult());
	}
}
class CustomThread2 extends Thread{
	Shared shared;
	public CustomThread2 (Shared shared, String string){
		super(string);
		this.shared = shared;
		start();
	}
	public void run() {
		shared.doWork();
	}
}
class Waiting{
	public static void main(String args[]){
	Shared shared = new Shared();
	CustomThread1 thread1 = new CustomThread1(shared, "one");
	CustomThread2 thread2 = new CustomThread2(shared, "two");
	}
}
