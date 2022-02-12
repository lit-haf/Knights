package lapbook;
import java.util.*;
public class AreaOfSquare {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sides of square:");
		double side=scan.nextDouble();
		double area=side*side;
		System.out.println("Area of square is:  "+area  );
	}

}
