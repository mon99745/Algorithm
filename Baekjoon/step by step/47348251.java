import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] arrA = new int[A];
        int[] arrB = new int[B];
        int[] result = new int[A+B+1];
        int count = 0;
        
        for(int i=0; i<A; i++){
            arrA[i] = sc.nextInt(); 
        }
        for(int i=0; i<B; i++){
            arrB[i] = sc.nextInt(); 
        }
        // 4. 배열 합치기        
        // 4.1 arr1을 result 복사 (index 0 ~ index 2)        
        System.arraycopy(arrA, 0, result, 0, A);        
        // 4.2 arr2를 result 복사 (index 3 ~ index 5)        
        System.arraycopy(arrB, 0, result, A, B);

        Arrays.sort(result);
        
        
      for(int i=1; i<A+B; i++){
        if(result[i] == result[i+1]){
          result[i] = 0;
          result[i+1] = 0;
        }
      }

      for(int i=1; i<A+B+1; i++){
        if(result[i] != 0) count++;
      }
      System.out.println(count);
    }
}