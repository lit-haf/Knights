package lapbook_2;

public class EnhancedForLoop {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int[]arr2=new int[5];
		int length=arr.length;
		for(int i=0;i<length;i++) 
		{
			System.out.print(arr[i]+"\t");
		}
		//Enhanced Loop
		System.out.println("\t");
		System.out.println("\t");
		System.out.println("ENHANCED FORLOOP:");
		System.out.println("\t");
		for(int i:arr)
		{
			System.out.print(i+"\t");
		}
		System.out.println();
		String str[]=new String[5];
		for(int i=0;i<str.length;i++)
		{
			str[i]="hello"+i;
		}
		for(String s:str)
		{
			System.out.println(s+"\t");
		}
			
	}

}
