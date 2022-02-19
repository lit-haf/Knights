package control_structure;

public class IfDemo {

	public static void main(String[] args) {
		int x,y;
		x=10;
		y=20;
		//IF Statement
		if(y>x)
			System.out.println("Y is greater than X");
		//IF ELSE Statement
		if(x>y)
			System.out.println("X is greater than Y");
		else
			System.out.println("Y is greater than X");
		//NESTED IF ELSE Statement
		if(x==y)
			System.out.println("X equals to Y");
			if(x>y)
				System.out.println("X is greater than Y");
			else
				System.out.println("Y is greater than X");
	}

}
