package programs;

public class BubbleSortAscending {
    
	
	public static void main(String[] args) {
		//declare and initialize the array
		int[] x= {50,90,20,10,60};
		//compare one value of array with all the remaining value's of the array and swap the value if it is greater than compared value
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]>x[j])
				{
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		//print the array values
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
	}
}
