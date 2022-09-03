import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int F = sc.nextInt();
        int result = 0;
        N -= N%100;
        
        while(100 > result){
            if((N+result)%F==0){
                if(result<10) System.out.println("0"+result);
                else System.out.println(result);
                break;
            }
            result++;
        }

    }
}