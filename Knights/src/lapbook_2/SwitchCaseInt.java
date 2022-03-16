package lapbook_2;
import java.util.*;
public class SwitchCaseInt {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a  INT value:");
		int i=scan.nextInt();
		
		System.out.println("\nSwitch Case for Int is Called........");
		System.out.println();
		switch(i)
		{
		default:
		{
			System.out.println("Default called "+i);
			break;
		}
		case 1:
		{
			System.out.println("Value of Int is "+i);
			break;
		}
		case 2:
		{
			System.out.println("Value of  Int is "+i);
			break;
		}
		case 3:
		{
			System.out.println("Value of Int is "+i);
			break;
		}
		}
	}

}
