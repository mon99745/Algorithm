import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());

		bw.write(String.valueOf(A.add(B)));
		bw.flush(); 
		bw.close();
    }
}