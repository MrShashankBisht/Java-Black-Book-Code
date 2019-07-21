class SleepDemo {
	public static void main(String args[]) {
		try { 
			System.out.println("Hello");
			Thread.sleep(1000);
			System.out.println("from");
			Thread.sleep(1000);
			System.out.println("Java.");
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {}
	}
}
