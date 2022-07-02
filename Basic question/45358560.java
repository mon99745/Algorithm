import java.util.Scanner;
public class Main{
public static void main(String[] args){
int reH, reM;
Scanner sc = new Scanner(System.in);
int H = sc.nextInt();
int M = sc.nextInt();
    
reH = H;   
reM = M-45;
    
if (reM<0){
    reH = H-1;
    reM = 60+reM;
    
    if(reH<0){
        reH = 24+reH;
    }
  }
    System.out.println(reH+" "+reM);
}
}


