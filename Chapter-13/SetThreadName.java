class SetThreadName{
	public static void main(String args[]){
		Thread thread = Thread.currentThread();
		System.out.println("Main thread's original name is " + thread.getName());
		thread.setName("Kogent");
		System.out.println("Main thread's name is now " + thread.getName());
	}
}