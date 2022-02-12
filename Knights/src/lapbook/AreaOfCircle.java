package lapbook;
import java.util.*;
public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		double radius=scan.nextDouble();
		double area=Math.PI*(radius*radius);
		System.out.println("Area of the circle is:  "+area);
		double circumference=Math.PI*2*radius;
		System.out.println("Circumference of the circle is:   "+circumference);
	}

}
