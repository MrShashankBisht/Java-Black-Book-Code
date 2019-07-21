public class CounterImpl implements CounterMXBean {
	private int count=0;
	public int getCount() { return ++count; }
	public void setCount(int count) { this.count=count; }
	public void printCount() { System.out.println("Count: "+count); }
}
