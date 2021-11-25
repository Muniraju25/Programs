package programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class OccuranceOfString {
  public static void main(String[] args) {
	  String s="tyss";
	  char[] x=s.toCharArray();
	HashMap<Character, Integer> a=new HashMap<Character, Integer>();
	for(Character v:x)
	{
		if(!a.containsKey(v))
		{
			a.put(v, 1);
		}else {
			int count=a.get(v);
			a.put(v, count+1);
		}
	}
	for(Entry<Character, Integer> o:a.entrySet())
	{
		System.out.println(o.getKey()+"="+o.getValue());
	}
	
}
}
