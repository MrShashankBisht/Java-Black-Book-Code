import java.util.*;
import java.util.concurrent.*;   

public class TestingExchanger {   
	private static final int FULL = 10;
	private static final int COUNT = FULL * 20;
	private static final Random rnd = new Random();
	private static volatile int sum = 0;
	private static Exchanger<List<Integer>> exchanger = new Exchanger<List<Integer>>();
	private static List<Integer> EmptyBuffer;
	private static List<Integer> FullBuffer;
	private static CountDownLatch Latch_stop = new CountDownLatch(2);   
	private static class FillLoop implements Runnable {
		public void run() {
			List<Integer> currentBuf = EmptyBuffer;
			try {
				for (int i = 0; i < COUNT; i++) {
					if (currentBuf == null)
					break; 
					Integer item = rnd.nextInt(100);
					System.out.println("Added: " + item);
					currentBuf.add(item);
					if (currentBuf.size() == FULL)
					currentBuf = exchanger.exchange(currentBuf);
				}
			}
			catch (InterruptedException ex) {
				System.out.println("Bad exchange on filling side");
			}
			Latch_stop.countDown();
		}
	}   
	private static class EmptyLoop implements Runnable {
		public void run() {
			List<Integer> currentBuf = FullBuffer;
			try {
				for (int i = 0; i < COUNT; i++) {
					if (currentBuf == null)
					break; 
					Integer item = currentBuf.remove(0);
					System.out.println("Got: " + item);
					sum += item.intValue();
					if (currentBuf.isEmpty()) {
					currentBuf = exchanger.exchange(currentBuf);
					}
				}
			}
			catch (InterruptedException ex) {
				System.out.println("Bad exchange on emptying side");
			}
			Latch_stop.countDown();
		}
	}   
	public static void main(String args[]) {
		EmptyBuffer = new ArrayList<Integer>();
		FullBuffer = new ArrayList<Integer>(FULL);
		for (int i=0; i<FULL; i++) {
			FullBuffer.add(rnd.nextInt(100));
		}
		new Thread(new FillLoop()).start();
		new Thread(new EmptyLoop()).start();
		try {
			Latch_stop.await();
		} 
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("Sum of all items is.... " + sum);
	}
}