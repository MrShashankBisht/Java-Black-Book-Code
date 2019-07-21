import java.util.concurrent.*;
import java.util.*;   

public class TestingSemaphore{
	private static final int COUNT_LOOP = 100;
	private static final int MAX_AVAILABLE = 2;
	private final static Semaphore sphore = new Semaphore(MAX_AVAILABLE, true);   
	private static class Price {
		private static final Random rnd = new Random();
		public static int getPrice() {
			int prc = rnd.nextInt(100);
			try {
				Thread.sleep(50);
			} 
			catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			return prc;
		}
		public static int getunfavPrice() {
			return 20;
		}
}
public static void main(String args[]) {
	for (int i=0; i< COUNT_LOOP; i++) {
		final int count = i;
		new Thread() {
			public void run() {
				int prc;
				if (sphore.tryAcquire()) {
					try {
						prc = Price.getPrice();
					} 
					finally {
						sphore.release();
					}
				} else {
					prc = Price.getunfavPrice();
				}
				System.out.println(count + ": " + prc);
			}
		}.start();
	}
}
}