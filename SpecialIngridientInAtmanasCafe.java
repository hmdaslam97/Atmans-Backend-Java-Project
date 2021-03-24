import java.util.*;

public class SpecialIngridientInAtmanasCafe 
{
	public static void main(String[] args) 
	{
//		Reading All the Dishes	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter No of Dishes");
		int N=scan.nextInt();
		System.out.println("Enter "+N+" no of Dishes");
		List<String> dishes=new ArrayList<String>();
		for(int i=0;i<N;i++)
		{
			dishes.add(scan.next());
		}
		checkSpecialIngridients(dishes);
	}

	static void checkSpecialIngridients(List<String> dishes) 
	{
		
		char[] c=findSmallestString(dishes).toCharArray();
		int specialIngredients=0;
		for(int i=0;i<c.length;i++)
		{
			String temp=""+c[i];
			int count=0;
			for(int j=0;j<dishes.size();j++)
			{
				if(dishes.get(j).contains(temp))
				{
					count++;
				}
			}
			if(count==dishes.size())
			{
				specialIngredients++;
			}
		}
		System.out.println("Total no of Special Ingredients "+specialIngredients);
	}
	
	static String findSmallestString(List<String> dishes) 
	{
		String str="";
		int len=dishes.get(0).length();
		for(int i=0;i<dishes.size();i++)
		{
			if(len>dishes.get(i).length())
			{
				len=dishes.get(i).length();
				str=dishes.get(i);
			}
		}
		return str;
	}
}
