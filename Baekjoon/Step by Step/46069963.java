import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
        int M = in.nextInt(); // M이상
		int N = in.nextInt(); // N이하
		int sum = 0; 
        int min = 0;
		int count = 0; //최솟값을 초기값을 위한 카운트
        
        for(int i = M; i <= N; i++) { //M~N
			
            // 소수인경우 true, 아닌경우 false   
			boolean isPrime = true;
            
			if(i == 1) {	// 1 인경우 다음 반복문으로
				continue;
			}
            
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					isPrime = false;	// 소수가 아니므로 false 로 바꿔줌
					break;
				}
			}
            if(isPrime){
                count++;
                    sum += i;
                
                    if(count==1){// 초기값
                        min = i;
                    }
                    else{
                        if(min>i){
                            min=i;
                        }
                    }
                }
		}
        
        if(sum == 0){ // 소수가 없을 때의 예외
            System.out.println("-1");
        }
        else{
            System.out.println(sum);
		    System.out.println(min);
        }
        
	}
 
}