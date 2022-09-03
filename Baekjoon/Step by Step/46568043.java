import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int [N][2];
        
        for(int i=0; i<N; i++){
            for(int j=0; j<2; j++){
                arr[i][j] = sc.nextInt();
                
            }
        }
        
		Arrays.sort(arr, (arr_1, arr_2) -> {

			if(arr_1[0] == arr_2[0])  {
				return arr_1[1] - arr_2[1];
			}
			else {
				return arr_1[0] - arr_2[0];	
			}
		});
        
        for(int i=0; i<N; i++){
            for(int j=0; j<2; j++){
                System.out.println(arr[i][j]);
                
            }
        }
    }
}