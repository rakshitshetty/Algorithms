
public class Algos 
{

	public static void main(String[] args) 
	{
		int[] array={10,9,8,7,6,5,4,3};
		mergeSort(array);
		for(int ele:array)
		{
			System.out.print(ele+"->");
		}
		

	}
	
	public static void mergeSort(int[] array)
	{
		if(array.length<2)
		{
			return;
		}
		else
		{
			int mid =array.length/2;
			
			int[] leftarray=new int[mid];
			int[] rightarray=new int[array.length-mid];
			
			for(int i=0;i<mid;i++)
			{
				leftarray[i]=array[i];
			}
			for(int i=mid;i<array.length;i++)
			{
				rightarray[i-mid]=array[i];
			}
			
			
			mergeSort(leftarray);
			mergeSort(rightarray);
			merge(leftarray,rightarray,array);
		}
		
	}
	
	public static void merge(int[] leftarray,int[] rightarray,int[] array)
	{
		int i=0,j=0,k=0;
		while(i<leftarray.length && j<rightarray.length)
		{
			if(leftarray[i]<=rightarray[j])
			{
				array[k]=leftarray[i];
				i=i+1;
				
			}
			else
			{
				array[k]=rightarray[j];
				j=j+1;
				
			}
			k=k+1;
		}
		while(i<leftarray.length)
		{
			array[k]=leftarray[i];
			i=i+1;
			k=k+1;
		}
		while(j<rightarray.length)
		{
			array[k]=rightarray[j];
			j=j+1;
			k=k+1;
		}
		
	}
	
	public static void swap(int x,int y,int[] array)
	{
		int temp=array[x];
		array[x]=array[y];
		array[y]=temp;
	}

}
