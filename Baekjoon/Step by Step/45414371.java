import java.util.Scanner;

public class Main{
public static void main(String[] args){

Scanner sc = new Scanner (System.in);

int count = sc.nextInt();
int x = sc.nextInt();

int[] num = new int[count];

for(int i=0; i<count; i++){
    num[i] = sc.nextInt();	
    }
for(int j=0; j<count; j++){
    if(x>num[j]) System.out.println(num[j]);
    }
}
}