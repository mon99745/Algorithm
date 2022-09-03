import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        //1: x- y+ /2: x+ y+ /3:x- y- /4 x+ y-
		int X = sc.nextInt();
		int Y = sc.nextInt();
        
		if(X > 0) {
			if(Y > 0) {
				System.out.print(1);
			} 
			else {
				System.out.print(4);
			}
		} 
		
		else {
			if(Y > 0) {
				System.out.print(2);
			} 
			else {
				System.out.print(3);
			}
		}

	
	}

}