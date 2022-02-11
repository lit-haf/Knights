package lapbook;
import java.util.*;
public class OddOreven {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value:");
		int num=scan.nextInt();
		if(num%2==0)
		
			System.out.println("It is even num");
		
		else
			System.out.println("It is odd num");
	}

}
