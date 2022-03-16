package lapbook_2;

public class SwitchCaseEnum {

	public static void main(String[] args) {
		enum Myenum{apple,mango,grapes};
		
		System.out.println("Switch case for enum is called....");
		System.out.println();
		
		switch(Myenum.grapes)
		{
		case apple:
		{
			System.out.println("apple enum called");
			break;
		}
		case grapes:
		{
			System.out.println("grapes enum called");
			break;
		}
		default:
		{
			System.out.println("default of enum is called");
		}
		}

	}

}
