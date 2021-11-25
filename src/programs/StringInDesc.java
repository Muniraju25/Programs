package programs;

import java.util.TreeSet;

public class StringInDesc {
  
	public static void main(String[] args) {
		String[] a = {"java","selenium","manual","sql"};
		  TreeSet<String> set=new TreeSet<String>();
		  for(int i=0;i<a.length;i++)
		  {
			  set.add(a[i]);
		  }
              System.out.println(set.descendingSet());
		descendingString();
	}
	static void descendingString()
	{
		String[] a = {"java","selenium","manual","sql"};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;i<a.length;i++)
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
