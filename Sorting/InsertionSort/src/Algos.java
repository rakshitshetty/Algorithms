

	public class Algos 
	{

		public static void main(String[] args) 
		{
			int[] array={10,9,8,7,6,5,4,3};
			insertionSort(array);
			

		}
		
		public static void insertionSort(int[] array)
		{
			int j;
			for(int i=1;i<array.length;i++)
			{
				int toInsert=array[i];
				
				
				for( j=i;j>0;j--)
				{
					if(array[j-1]>toInsert)
					{
						array[j]=array[j-1];
					}
					
				}
				array[j]=toInsert;
				
				
				
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


