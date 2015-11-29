import java.util.ArrayList;


public class Algos 
{
	public static void main(String[] args)
	{
			int[] store={0,1,2,3,4};

			System.out.println(binarySearch( 5,store));
	}
	
	public static boolean binarySearch(int key,int[] store)
	{
		boolean found =false;
		int low=0;
		int high=store.length-1;
		int mid;
				
		
		while(low>high)
		{
			mid=(low+high)/2;
			if(key<store[mid])
			{
				high=mid-1;
			}
			else if(key>store[mid])
			{
				low=mid+1;
			}
			else
			{
				found=true;
				break;
			}

			
		}
		return found;
		
	}
}
