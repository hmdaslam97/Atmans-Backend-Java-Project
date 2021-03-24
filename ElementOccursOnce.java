package atmanBackend;

import java.util.*;

public class ElementOccursOnce 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the No of Elements");
		int n=scan.nextInt();
		System.out.println("Enter "+n+" no of Elements into Array");
		int[] intArr=new int[n];
		for(int i=0;i<intArr.length;i++)
		{
			intArr[i]=scan.nextInt();
		}
		Arrays.sort(intArr);
		
		printNonRepeatingElement(intArr);
	}

	static void printNonRepeatingElement(int[] intArr) 
	{
		for (int i = 0; i < intArr.length; i++) 
		{
		   boolean unique = true;
		   for (int j = 0; j < intArr.length; j++) 
		   {
			    if (i != j && intArr[i] == intArr[j]) 
			    {
			     unique = false;
			     break;
			    }
		   }
		   if (unique) 
		   {
			    System.out.println("The element that occurs just once in the Array: " + intArr[i]);
		   }
		}
	}
	
}
