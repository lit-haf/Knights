package lapbook;
import java.util.*;
public class UseInputArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[]=new int[10];
		int sum=0;
		System.out.println("Enter the number");
		for(int i=0;i<10;i++) {
			arr[i]=scan.nextInt();
		}
		for(int num:arr) {
			sum=sum+num;
		}
		System.out.println("sum of array elements is:   "+sum);
	}
}
