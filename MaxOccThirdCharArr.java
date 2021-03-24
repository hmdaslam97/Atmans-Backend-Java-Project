import java.util.*;

public class MaxOccThirdCharArr 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String inputString=scan.next();
		mostFrequent(pickMultipleOfThree(inputString));
	}
	static String pickMultipleOfThree(String inputString)
	{
		
		char[] c=inputString.toCharArray();
		String elements="";
		
//		to store only 3rd occurance element into array
		for(int i=2;i<c.length;i+=3)
		{
			System.out.print(c[i]);
			elements+=c[i];
		}
		System.out.println();
//		System.out.println(elements);
		return elements;
	}
	static void mostFrequent(String str) 
    {
		 // Create array to keep the count of individual
        // characters and initialize the array as 0
        int count[] = new int[256];
      
        // Construct character count array from the input string.
        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;
      
        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result
      
        // Traversing through the string and maintaining the count of each character
        for (int i = 0; i < len; i++) 
        {
            if (max < count[str.charAt(i)]) 
            {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        System.out.println(result);
	}
}
