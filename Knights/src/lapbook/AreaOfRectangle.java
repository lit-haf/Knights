package lapbook;
import java.util.*;
public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:");
		double length=scan.nextDouble();
		System.out.println("Enter the width of the rectangle:");
		double width=scan.nextDouble();
		double area=length*width;
		System.out.println("Area of rectangle is:  "+area);
				
	}

}
