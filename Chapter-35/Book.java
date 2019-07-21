import javax.management.MXBean;
@MXBean
public interface Book {
	@Page("Not including the hidden one") 
	@PageRange(minValue=0, maxValue=1000)
	public int getNumberOfPages();
}

