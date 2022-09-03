import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 카드의 갯수
        int M = sc.nextInt(); // 카드 합의 최대값
        int max = 0;
        int[] arr = new int[N];
            
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        } 
        for(int x=0; x<N; x++){
            for(int y=0; y<N; y++){
                for(int z=0; z<N; z++){
                    if(arr[x]!=arr[y] && arr[x]!=arr[z] && arr[y]!=arr[z]){
                    if(M >= arr[x]+arr[y]+arr[z]){ // 최대값을 넘지않는 선
                        if(max < arr[x]+arr[y]+arr[z]){ // 그 중 최대값
                            max = arr[x]+arr[y]+arr[z];
                        }
                        } 
                    }
                }
            }
        }
        System.out.println(max);
    }
}