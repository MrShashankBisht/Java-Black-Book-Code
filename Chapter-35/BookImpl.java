public class BookImpl implements Book {
	private int pagecount = 1000;
	public int getNumberOfPages() { return pagecount; }    
	public void setPageCount(int pagecount) { this.pagecount = pagecount; }
}
