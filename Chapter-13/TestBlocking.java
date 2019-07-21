import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Date;
import java.util.Random;
import java.io.PrintStream;

class Producer extends Thread {
	private BlockingQueue<String> blockQ;
	private PrintStream prnStr;
	public Producer(BlockingQueue<String> blockQ, PrintStream prnStr) {
		this.prnStr = prnStr;
		this.blockQ = blockQ;
	}
	public void run() {
	try {
		while(true){
			String time = String.format("%tc",new Date());
			prnStr.println("Putting item on BlockingQueue at time: " + time);
			blockQ.put("Enqueued at: " + time);
			Random generate = new Random();
			int randomSlp = generate.nextInt(5) + 1;
			Thread.sleep(randomSlp * 100);
		}
	}
	catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
}

class Consumer extends Thread {
	private BlockingQueue blockQ;
	private String consumName;
	private PrintStream prnStr;
	public Consumer(String consumName, BlockingQueue blockQ, PrintStream prnStr) {
		consumName = this.consumName;
		blockQ = this.blockQ;
		prnStr = this.prnStr;
	}
	public void run() {
		while (true){
			try {
				prnStr.println(this.consumName + blockQ.take());
			}
			catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}
public class TestBlocking {
	public static void main(String args[]) {
		BlockingQueue<String> blkQ = new LinkedBlockingQueue<String>();
		Producer prod = new Producer(blkQ, System.out);
		Consumer consA = new Consumer("ConsumerA", blkQ, System.out);
		Consumer consB = new Consumer("ConsumerB", blkQ, System.out);
		Consumer consC = new Consumer("ConsumerC", blkQ, System.out);
		Consumer consD = new Consumer("ConsumerD", blkQ, System.out);	
		prod.start();
		consA.start();
		consB.start();
		consC.start();
		consD.start();  
	}
}
