package programs;

public class AdditionOfArray {
  public static void main(String[] args) {
	int[] a= {1,3,5};
	int[] b= {2,4,6,8};
	//Step-1: Find the maximum length of array and store it in a count variable 
	int count=a.length;
	if(count<b.length)
	{
		count=b.length;
	}
	//with help of try and catch block handle the exception  
	for(int i=0;i<count;i++)
	{
		try {
			System.out.print(a[i]+b[i]+" ");
		}catch (Exception e) {
			if(a.length>b.length)
			{
				System.out.print(a[i]);
			}else {
				System.out.print(b[i]);
			}
		}
	}
}
}
