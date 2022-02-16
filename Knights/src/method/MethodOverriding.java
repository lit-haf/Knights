package method;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hall obj=new MarriageHall();
		obj.feast();
		Hall objj=new BirthdayHall();
		objj.feast();
	}

}
class Hall
{
	public void feast()
	{
		System.out.println("General Feast");
	}
}
class MarriageHall extends Hall
{
	public void feast()
	{
		System.out.println("Specific Food");
	}
}
class BirthdayHall extends Hall
{
	public void feast()
	{
		System.out.println("Cake");
		super.feast();
	}
}