package newpgms;

public class Sample2 {
   public static void main(String[] args) {
	int[] a= {1,0,2,0,3,0,0,4};
	int zeroCount=0;
	int[] b=new int[a.length];
	for(int i=0;i<a.length;i++)
	{
		zeroCount++;
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==0)
		{
			b[b.length-i]=a[i];
		}
	}
	/*for(int i=zeroCount;i>=1;i--)
	{
	  b[b.length-i]=0;  	
	}*/
	for(int i=0;i<b.length;i++)
	{
		System.out.print(b[i]+" ");
	}
}
}
