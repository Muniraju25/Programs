package hpgms;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sample2 {
  public static void main(String[] args) {
	String s="Muniraju";
	Set<Character> set=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		set.add(s.charAt(i));
	}
	for(Character ch:set)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
		   if(ch==s.charAt(i))
		   {
			   count++;
		   }
		}
		System.out.println(ch+"="+count);
	}
	
}
}
