import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int tot=a+b;
if(tot%2==0) {
	System.out.println("EVEN");
}
else {
	System.out.println("ODD");
}
	}

}
