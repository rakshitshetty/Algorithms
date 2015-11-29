

	public class Algos 
	{

		public static void main(String[] args) 
		{
			int[] array={10,9,8,7,6,5,4,3};
			selectionSort(array);
			

		}
		
		public static void selectionSort(int[] array)
		{
			for(int i=0;i<array.length;i++)
			{
				int min=i;
				
				for(int j=i+1;j<array.length;j++)
				{
					if(array[j]<array[min])
					{
						min=j;
					}
				}
				swap(i,min,array);
				
				
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


