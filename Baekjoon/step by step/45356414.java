import java.util.Scanner;
public class Main{
public static void main(String[] args){
int x,y;

Scanner sc = new Scanner(System.in);
x = sc.nextInt();
y = sc.nextInt();

	
System.out.println((y%10)*x);
System.out.println((y%100/10)*x);
System.out.println((y/100)*x);
System.out.println(x*y);
}
}