package control_structure;

public class ConditionalDemo {

	public static void main(String[] args) {
		//TERNARY OPERATOR
		
		
		System.out.println(true ?"success":"failure");
		
		
		boolean boo=false;
		String result=boo?"success":"failure";
		System.out.println(result);
		
		
		
		int num=11%2;
		boo=(num==0);
		result=boo?"even num":"odd num";
		System.out.println(result);

	}

}
