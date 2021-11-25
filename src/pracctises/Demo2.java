package pracctises;

public class Demo2 {
 public static void main(String[] args) {
	int[] a= {1,2,3,4};
	int[] b= {5,6,7,1,1};
	int count=a.length;
	if(a.length<b.length)
	{
		count=b.length;
	}
	for(int i=0;i<count;i++)
	{
		try {
			System.out.print(a[i]+b[i]+" ");
		} catch (Exception e) {
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
