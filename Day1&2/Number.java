import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			if(a>0) {
				System.out.println("Positive");
			}
			else if(a<0) {
				System.out.println("Negative");
			}
			else {
				System.out.println("Zero");
			}
		}

	}
