package newpgms;

import java.util.LinkedHashSet;
import java.util.Set;

public class Tester {
 public static void main(String[] args) {
	String s="tester";
	Set<Character> set=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		set.add(s.charAt(i));
	}
	for(Character ch:set)
	{
		for(int i=0;i<s.length();i++)
		{
			if(ch.equals(s.charAt(i)))
			{
				System.out.println(s.charAt(i)+"-"+(i+1));
				break;
			}
		}
	}
}
}
