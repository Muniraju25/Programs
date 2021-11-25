package programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWord {
	public static void main(String[] args) {
		String s="welcome to tyss and to testing";
		String[] str = s.split(" ");
		//Step-1: Create Set collection and add all the STRING of given string array
		Set<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		    for(String word:set) {
			System.out.print(word+" ");	
		}
	}
}
