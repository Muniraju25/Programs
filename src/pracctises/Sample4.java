package pracctises;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sample4 {
   public static void main(String[] args) {
	String s="hi welcome to test yantra hi";
	String[] a=s.split(" ");
	Set<String> set=new LinkedHashSet<String>();
	for(int i=0;i<a.length;i++)
	{
		set.add(a[i]);
	}
	for(String ch:set)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(ch.equals(a[i]))
			{
				count++;
			}
		}
		if(count==1)
		{
		System.out.println(ch+"="+count);
	}
	}
	
}
}
