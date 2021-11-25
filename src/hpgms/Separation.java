package hpgms;

public class Separation {
  public static void main(String[] args) {
	String s="a23$2e&*r2t9";
	String alpha="";
	String num="";
	String spl="";
	for(int i=0;i<s.length();i++)
	{
	   if(s.charAt(i)>='A' && s.charAt(i)<='Z')
	   {
		   alpha=alpha+s.charAt(i);
	   }else if(s.charAt(i)>='a' && s.charAt(i)<='z')
	   {
		   alpha=alpha+s.charAt(i);
	   }else if(s.charAt(i)>='0' && s.charAt(i)<='9')
	   {
		   num=num+s.charAt(i);
	   }else {
		   spl=spl+s.charAt(i);
	   }
	}
	System.out.println(alpha);
	System.out.println(num);
	System.out.println(spl);
}
}
