import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt(); 
        int k;
        int han = 0;
        int a[] = new int[3];
        
		for (int i = 1; i <= N; i++) {
			if (0 < i && i < 100) han = i;
			else if (i == 1000) break;
			else {
				k = 0; int t = i;
				while (t > 0) {
					a[k] = t % 10;
					t /= 10; k++;
				}
				if (a[0] - a[1] == a[1] - a[2]) han++;
			}
		}
		System.out.println(han);
	}
}