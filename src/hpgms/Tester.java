package hpgms;

public class Tester {
  public static void main(String[] args) {
	  reverseWithOutRevAriable();
	  reverseWithOutLength();
	  swapStringWithOutVar();
}
  public static void reverseWithOutRevAriable()
  {
	  String s="Mango";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
  }
  public static void reverseWithOutLength()
  {
	  String s="Mango";
	  String rev="";
	  int length=s.compareTo(rev);
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
  }
  public static void swapStringWithOutVar()
  {
	  String s1="abc";
	  String s2="xyz";
	  s1=s1+s2;
	  s2=s1.substring(0, s1.length()-s2.length());
	  s1=s1.substring(s2.length());
	  System.out.println(s1);
	  System.out.println(s2);
  }
}
