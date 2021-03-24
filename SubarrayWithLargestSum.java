import java.util.*;

public class SubarrayWithLargestSum 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of Whole Numbers");
		int N=scan.nextInt();
		System.out.println("Enter "+N+" no of Whole Numbers");
		int[] a=new int[N];
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=scan.nextInt();
		}
        getSubArrayWithLargeSum(a);
	}

	static void getSubArrayWithLargeSum(int[] a) 
	{
		int max_so_far = Integer.MIN_VALUE,max_ending_here = 0, start = 0, end = 0, s = 0, size=a.length;
		 
//		getting subarray which has largest sum
        for (int i = 0; i < size; i++)
        {
            max_ending_here += a[i];
 
            if (max_so_far < max_ending_here)
            {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
 
            if (max_ending_here < 0)
            {
                max_ending_here = 0;
                s = i + 1;
            }
        }
        System.out.print("Subarray with largest sum is { ");
        for(int i=start;i<=end;i++)
        {
        	System.out.print(a[i]+" ");
        }
        System.out.print("} with sum "+ max_so_far);
	}
}