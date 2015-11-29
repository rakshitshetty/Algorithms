
public class Search 
{

	public static void main(String[] args) 
	{
		int[] input={15,16,19,20,25,1,3,4,5,7,10,15};
		int toFind=5;
		int left=0;
		int right=input.length-1;
		
		binSearch(left,right,input,toFind);

	}
	
	public static void binSearch(int left,int right,int[] input,int toFind)
	{
			
			int mid;
			
			while(true)
			{
		
				if(left>right)
				{
					return;
				}
				else
				{
					mid=(left+right)/2;
					if(input[mid]==toFind)
					{
						System.out.println("found at pos "+ mid);
						return;
					}
					else if(input[left]<input[mid])
					{
						if(toFind>input[mid])
						{
							left=mid+1;
						}
						else if(toFind>=input[left])
						{
							right=mid-1;
						}
						else
						{
							left=mid+1;
						}
						
					}
					else if(toFind<input[mid])
					{
						right=mid-1;
					}
					else if(toFind<=input[right])
					{
						left=mid+1;
					}
					else
					{
						right=mid-1;
					}
					
				}
			}
		
			
		
	}

}
