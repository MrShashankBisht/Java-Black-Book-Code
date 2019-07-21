class MainThread{
	public static void main(String args[]){
		Thread thread = Thread.currentThread();
		System.out.println("Main thread is named \"" + thread.getName()+"\"");
	}
}
