package lapbook;
import java.util.*;
public class Multiply {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value for a: ");
		int a=scan.nextInt();
		System.out.println("Enter the value for b:");
		int b=scan.nextInt();
		int mul=a*b;
		System.out.println("The multiplication of  "+a+"  and   "+b+"  is:   "+mul);
	}

}
