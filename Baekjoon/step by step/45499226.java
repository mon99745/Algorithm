import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] arr;
		int testcase = in.nextInt();
		
		for(int i = 0 ; i < testcase ; i++){
 
			int N = in.nextInt();
			arr = new int[N];
			double sum = 0;
			
			for(int j = 0 ; j < N ; j++){
				int val = in.nextInt();	// 성적입력 
				arr[j] = val;
				sum += val;	// 성적 누적 합 
			}
			
			double mean = (sum / N) ;
			double count = 0; // 평균넘는 학생 수 
			
			// 평균넘는 학생비율
			for(int j = 0 ; j < N ; j++){
				if(arr[j] > mean) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n",(count/N)*100);
		}
	}
}