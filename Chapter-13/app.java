import java.util.concurrent.*;   
public class app {
	private static int matrices[][] = {
										{1},
										{2, 2},
										{3, 3, 3},
										{4, 4, 4, 4},
										{5, 5, 5, 5, 5}
										};
	private static int res[];   
	private static class Summer extends Thread {
		int row;
		CyclicBarrier barier;
		Summer(CyclicBarrier barier, int row) { 
			this.barier = barier;
			this.row = row;
		}
		public void run() {
			int cols = matrices[row].length;
			int sum = 0;
			for (int i=0; i<cols; i++) {
				sum += matrices[row][i];
			}
			res[row] = sum;
			System.out.println("Results for row " + row + " are : " + sum);
			try {
				barier.await();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			} catch (BrokenBarrierException ex) {
				ex.printStackTrace();
			}
		}	
	}
	public static void main(String args[]) {
		final int rows = matrices.length; 
		res = new int[rows];
		Runnable merger = new Runnable() {
			public void run() {
				int sum = 0;
				for (int i=0; i<rows; i++) {
					sum += res[i];
				}
				System.out.println("Results are: " + sum);
			}
		};
		CyclicBarrier barier = new CyclicBarrier(rows, merger);
		for (int i=0; i<rows; i++) {
			new Summer(barier, i).start();
		}
		System.out.println("Waiting...");
	}
}