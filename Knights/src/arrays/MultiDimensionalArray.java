package arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int arr[][]= { 
				
				{1,2,3,4,5},
				{ 6,7,8,9,10},
				{7336,73736,938447,83732}
		};
		System.out.println(arr.length);
		System.out.println(arr[2].length);
		
		int ar[][]=new int[3][5];
		ar[0][3]=10;
		System.out.println(ar[0][3]);
	}

}
