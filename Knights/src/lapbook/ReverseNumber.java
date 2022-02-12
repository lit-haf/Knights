package lapbook;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,reversenum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=scan.nextInt();
		while(num!=0)
		{
			reversenum=reversenum*10;
			reversenum=reversenum + num%10;
			num=num/10;
		}
		System.out.println("Reverse of input num is:  "+reversenum);
	}

}
