import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int sum = h * 60 + m + n;
		h = sum/60;
		m = sum%60;
		
		if (h>=24) {
			h= h-24;
		}
		
		System.out.println(h + " "+ m);

	}
}