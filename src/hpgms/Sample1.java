package hpgms;

public class Sample1 {
  public static void main(String[] args) {
	  int[] arr= {50,60,87,10,5};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
				   int temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
				}
			}
		}
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
}
}
