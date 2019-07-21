
@MXBean
public interface Counter {   
	//there is no need of suffix MXBean now.
	public int getCount(); public void setCount(int count);
	public void printCount();	
}
