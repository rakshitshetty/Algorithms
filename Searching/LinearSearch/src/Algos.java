import java.util.ArrayList;


public class Algos 
{
	public static void main(String[] args)
	{
		
			
			ArrayList<Integer> store=new ArrayList<Integer>();
			for(int i=0;i<5;i++)
			{
				store.add(i);
			}
			System.out.println(linearSearch(4,store));
	}
	
	public static boolean linearSearch(int key,ArrayList<Integer> store)
	{
		boolean found =false;
		for(int i=0;i<store.size();i++)
		{
			if(i==key)
			{
				found=true;
				
			}
		}
		return found;
	}
}
