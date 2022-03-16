package lapbook_2;
import java.util.*;
public class SwitchCaseChar {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a char:");
			char c=scan.next().charAt(0);
			
			System.out.println("\n Switch case for Char is called...");
			System.out.println();
			
			switch(c)
			{
			case 'b':
			{
				System.out.println("b called "+c);
				break;
			}
			case 'a':
			{
				System.out.println("a called  "+c);
				break;
			}
			default:
			{
				System.out.println("default of char is called "+c);
			}
			}
		}
}
