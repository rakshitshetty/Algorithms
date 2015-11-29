
public class Search 
{

	public static void main(String[] args) 
	{
		int[][] matrix=new int[5][5];
		for(int i=0;i<5;i++)
		{
			
			for(int j=0;j<5;j++)
			{
				matrix[i][j]=(i+j+1)*10;
			}
						
		}
		matrix[1][1]=29;
		matrix[0][2]=29;
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(matrix[i][j]+"   ");
			}
			System.out.println();
						
		}
		
		binSearch(0,5,matrix,30);

	}
	
	public static void binSearch(int low,int high,int[][] array,int key)
	{
		int row=low;
		int col=high-1;
		
		while(col>=0 && row<high)
		{
			if(array[row][col]==key)
			{
				System.out.println("found at "+row+" "+col);
				break;
			}
			else if(key<array[row][col])
			{
				col--;
			}
			else
			{
				row++;
			}
		}
	}

}
