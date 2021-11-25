package pracctises;

public class Demo1 {
  public static void main(String[] args) {
	String[] a= {"hi","java","apple","samsung","nokia"};
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i].compareTo(a[j])>0)
			{
				String temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
}
}
