package inheritance;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lithaff obj=new Lithaff();
		obj.lithaf();
		obj.lithaff();
	}

}
class Lithaf 
{
	void lithaf()
	{
		System.out.println("Lithaf");
	}
}
class Lithaff extends Lithaf
{
	void lithaff()
	{
		System.out.println("Lithaff");
	}
}