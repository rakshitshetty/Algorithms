
public class Search 
{

	public static void main(String[] args) 
	{
		String[] array={"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
		String key="ball";
		int left=0;
		int right=array.length-1;
		
		System.out.println(binSearch(left,right,array,key));

	}
	
	public static int binSearch(int left,int right,String[] array,String key)
	{
		while(left <= right	)
		{
			while(left <= right	 && array[right]=="")
			{
				right--;
			}
			if(left>right)
			{
				return -1;
			}
			int mid=(left+right)>>1;
			while(array[mid]=="")
			{
				mid++;
			}
			int r=array[mid].compareTo(key);
			if(r==0)
			{
				return mid;
			}
			if(r<0)
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}
		return -1;
	}

}
