package lapbook;
import java.util.*;
public class FloydTriangle {

	public static void main(String[] args) {
		int num=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the rows for floyd triangle:");
		int rows=scan.nextInt();
		System.out.println("Floyd's Triangle");
		System.out.println("************************");
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+"  ");
				num++;
			}
			System.out.println();
		}
	}

}
