package lapbook;
import java.util.*;
public class WhileLoop {

	public static void main(String[] args) {
		int num,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter  the number:");
		num=scan.nextInt();
		while(num<=10)
		{
			sum=sum+num;
			num++;
	}
		System.out.format("Sum of the numbers from the while loop is :  %d  ",sum);
}
}