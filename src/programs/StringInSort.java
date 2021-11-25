package programs;

import java.util.TreeSet;

public class StringInSort {
  public static void main(String[] args) {
	  String[] a = {"java","selenium","manual","sql"};
	  TreeSet<String> set=new TreeSet<String>();
	  for(int i=0;i<a.length;i++)
	  {
		  set.add(a[i]);
	  }
	  System.out.println(set);
}
}
