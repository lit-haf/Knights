package lapbook_2;
import java.util.*;
public class SwitchCaseString {
 public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a string:");
	String s=scan.next();
	
	System.out.println("\n Switch case for String is called...");
	System.out.println();
	
	switch(s)
	{
	case "hai":
	{
		System.out.println("hai value "+s);
		break;
	}
	case "hello":
	{
		System.out.println("hello value "+s);
		break;
	}
	default:
	{
		System.out.println("default of string switch "+s);
	}
	}
}
}
