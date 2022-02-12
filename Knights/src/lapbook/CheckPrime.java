package lapbook;
import java.util.*;
public class CheckPrime {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=scan.nextInt();
		scan.close();
		int temp;
		boolean isprime=true;
		for(int i=2;i<=num/2;i++)
		{
			temp=num%1;
			if(temp==0)
			{
				isprime=false;
				break;
			}
		}
		if(isprime)
			System.out.println(num+ "   Is a prime num");
		else
			System.out.println(num+"  Is not a prime num");
	}

}
