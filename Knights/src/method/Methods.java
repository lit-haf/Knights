package method;

public class Methods {
	void lithaf()
	{
		System.out.println("Non Returnable Method");
	}
	int lithaff()
	{
		return 10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods obj=new Methods();
		obj.lithaf();
		int a=obj.lithaff();
		System.out.println(a);
	}

}
