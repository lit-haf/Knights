package lapbook;

public class largestNumber {

	public static void main(String[] args) {
		double n1=-5.5,n2=4.5,n3=3.5;
		if(n1 >= n2 && n1 >= n3)
			System.out.println("n1 is largest:   "+n1);
		else if(n2>=n1  &&  n2>=n3)
			System.out.println("n2 is largest:  "+n2);
		else
			System.out.println("n3 is largest:   "+n3);
	}

}
