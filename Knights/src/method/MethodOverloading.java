package method;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.lithaf();
		obj.lithaf(100);
		obj.lithaf(200,"lithaf");
	}
	void lithaf() {
		System.out.println("No Paramaters");
	}
	void lithaf(int i) {
		System.out.println("Single Paramater  "+i);
	}
	void lithaf(int j , String str) {
		System.out.println("Double Parameters   "  +j +"  "+str);
	}
}
