package programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String s="java";
		//Step-1: Create Set collection and add all the char of given string
		Set<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
	for(Character ch:set)
	{
		System.out.print(ch);
	}
	}
	}

