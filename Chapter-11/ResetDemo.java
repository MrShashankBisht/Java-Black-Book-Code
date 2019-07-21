import java.io.*;
class ResetDemo{
	public static void main(String args[]) throws IOException {
		String p = "pen";
		byte B[] = p.getBytes();
		ByteArrayInputStream in = new ByteArrayInputStream(B);
		for (int j=0; j<2; j++){
			int N;
			while ((N = in.read()) != -1){
				if (j == 0){
					System.out.print((char) N);
				} 
				else {
					System.out.print(Character.toUpperCase((char) N));
				}
			}
			System.out.println();
			in.reset();
		}
	}
}