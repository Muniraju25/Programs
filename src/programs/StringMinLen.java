package programs;

public class StringMinLen {
   
	public static void main(String[] args) {
		String[] a = {"Java","Selenium","Manual","UK"};
		int[] x=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
		    x[i]=a[i].length();	
		}
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
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length()==x[0])
			{
				System.out.println(a[i]);
			}
		}
	}
}
