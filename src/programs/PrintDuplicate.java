package programs;

import java.util.HashSet;

public class PrintDuplicate {
	public static void main(String[] args) {
		String s="java";
		//Step-1: Create Set collection and add all the char of given string
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		//Step-2:Compare each char of set with all the char of given string
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				//Step-3: if character is matching then increment count
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			//Step-4: Print character with count
			if(count>1) {
			System.out.println(ch+"="+count);
			}
		}
	}
}
