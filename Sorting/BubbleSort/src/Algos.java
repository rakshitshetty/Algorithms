
public class Algos 
{

	public static void main(String[] args) 
	{
		int[] array={10,9,8,7,6,5,4,3};
		bubbleSort(array);
		

	}
	
	public static void bubbleSort(int[] array)
	{
		for(int i=array.length-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(array[j]>array[j+1])
				{
					swap(j,j+1,array);
				}
			}
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.print(" ->"+array[i]);
		}
		
	}
	
	public static void swap(int x,int y,int[] array)
	{
		int temp=array[x];
		array[x]=array[y];
		array[y]=temp;
	}

}
