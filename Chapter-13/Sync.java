class Callme{
	void call(String msg) {
		System.out.print("**" + msg);
		try {
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
			System.out.println("Stop...");
		}
		System.out.println("****");
	}
}

class Caller implements Runnable {
	String ms;
	Callme target;
	Thread h;
	public Caller(Callme targ, String s) {
		target = targ;
		ms = s;
		h = new Thread(this);
		h.start();
	}
	public void run() {
		synchronized(target) { 
			target.call(ms);
		}
	}	
}

class Sync {
	public static void main(String args[]) {
		Callme target = new Callme();
		Caller c1 = new Caller(target, "Your");
		Caller c2 = new Caller(target, "JAVA");
		Caller c3 = new Caller(target, "Synchronized");
		try {
			c1.h.join();
			c2.h.join();
			c3.h.join();
		} 
		catch(InterruptedException e) {
			System.out.println("Stop...");
		}
	}
}
