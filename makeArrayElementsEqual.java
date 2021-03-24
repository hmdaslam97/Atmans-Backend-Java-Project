import java.util.Scanner;

public class makeArrayElementsEqual 
{
	public static void main(String[] args) 
	{
//		Reading Input 
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of Elements");
		int n=scan.nextInt();
		System.out.println("Enter the "+n+" no of Elements");
		int[] intArr=new int[n];
		for(int i=0;i<intArr.length;i++)
		{
			intArr[i]=scan.nextInt();
		}
		System.out.println("Enter Any Positive Integer for Incrementing");
		int k=scan.nextInt();
		
//		Printing No of operations Required
		System.out.println("No of Operation required To make All Array Elements Equal :"+noOfOperationToBalanceArray(intArr,k));
	}

	static int noOfOperationToBalanceArray(int[] intArr,int k) 
	{
		int operations=0;
		int large=findLarge(intArr);
		
//		checking whether the difference between Larger and other elements are divisible by k
		for(int i=0;i<intArr.length;i++)
		{
			int diff=large-intArr[i];
			if(diff%k!=0)
			{
				return -1;
			}
			operations+=diff/k;
		}	
		System.out.println(operations);
		return operations;
	}

	static int findLarge(int[] intArr) 
	{
//		To find Largest Element in Array and to make other elements same as largest!
		int large=0;
		for (int i = 0; i < intArr.length; i++) 
		{
			if(intArr[i]>large)
				large=intArr[i];
		}
		System.out.println("Largest is "+large);
		return large;
	}
}
