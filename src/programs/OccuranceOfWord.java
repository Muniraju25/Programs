package programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class OccuranceOfWord {
	public static void main(String[] args) {
		String s="welcome to tyss";
		String[] str = s.split(" ");
		//Step-1: Create Set collection and add all the STRING of given string array
		Set<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		//Step-2:Compare each String of set with all the string of given string array
		for(String ch:set)
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				//Step-3: if string  is matching then increment count
				if(ch.equals(str[i]))
				{
					count++;
				}
			}
			//Step-4: Print String with count
		    
			System.out.println(ch+"="+count);
			
		}
	}
}
