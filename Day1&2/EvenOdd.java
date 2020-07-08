import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a%2==0)
			System.out.println("EVEN");
		else
			System.out.println("ODD");
	}

}