

	public class Algos 
	{

		public static void main(String[] args) 
		{
			int[] array={10,9,8,7,6,5,4,3};
			quickSort(0,7,array);
			for(int i=0;i<array.length;i++)
			{
				System.out.print(" ->"+array[i]);
			}
			

		}
		
		public static void quickSort(int left,int right,int[] array)
		{
			if(right-left<=0)
			{
				return;
			}
			else
			{
				int pivot=array[right];
				int pivotlocation=partition(left,right,pivot,array);
				quickSort(left,pivotlocation-1,array);
				quickSort(pivotlocation+1,right,array);
			}
			
			

			
		}
		
		public static int partition(int left,int right,int pivot,int[] array)
		{
			int leftpointer,rightpointer;
			
			while(true)
			{
				for(leftpointer=left;leftpointer<right;leftpointer++)
				{
					if(array[leftpointer]>=pivot)
					{
						break;
					}
				}
				for(rightpointer=right;rightpointer>left;rightpointer--)
				{
					if(array[rightpointer]<pivot)
					{
						break;
					}
				}
				if(leftpointer>=rightpointer)
				{
					break;
				}
				else
				{
					swap(leftpointer,rightpointer,array);
				}

			}
			swap(leftpointer,right,array);
			
			return leftpointer;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		public static void swap(int x,int y,int[] array)
		{
			int temp=array[x];
			array[x]=array[y];
			array[y]=temp;
		}

	}



