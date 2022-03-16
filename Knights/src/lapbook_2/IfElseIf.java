package lapbook_2;
import java.util.*;
public class IfElseIf {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int i=scan.nextInt();
		if(i==10)
		{
			System.out.println("I value entered is 10");
		}
		else if(i==20)
		{
			System.out.println("I value entered is 20");
		}
		else if(i==30)
		{
			System.out.println("I value entered is 30");
		}
		else
		{
			System.out.println("Does not satisfy any condition..");
		}
		System.out.println("Please enter another number:");
		int j=scan.nextInt();
		if(i>=10 && j<=20)
		{
			System.out.println("The value is between 10 to 20");
		}
		else if(i>=20 && j<=30)
		{
			System.out.println("The value is between 20 to 30");
		}
		else if(i>=30 && j<=40)
		{
			System.out.println("The value is between 30 to 40");
		}
		else if(i>=40 && j<=100)
		{
			System.out.println("The value is between 40 to 100");
		}
		else
		{
			System.out.println("None the condition satisfy....");
		}
		
       	}
	}
