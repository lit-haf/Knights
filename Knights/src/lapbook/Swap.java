package lapbook;

public class Swap {

	public static void main(String[] args) {
		float first=2.50f;
		float second=4.50f;
		System.out.println("before swap:");
		System.out.println("first number  "+first);
		System.out.println("second number  "+second);
		
		float temp=first;
		first=second;
		second=temp;
		
		System.out.println("after swap:");
		System.out.println("first number  "+first);
		System.out.println("second number  "+second);
	}

}
