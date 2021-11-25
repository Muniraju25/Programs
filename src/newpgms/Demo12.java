package newpgms;

public class Demo12 {
   public static void main(String[] args) {
	   String s="wel$wel%35welabc";
	   String up="";
	  String wel="wel";
	  for(int i=0;i<s.length();i++)
	  {
		  String temp=""+s.charAt(i);
			  for(int k=i+1;k<s.length();k++)
			  {
				  temp=temp+s.charAt(k);
				  if(temp.equals(wel))
				  {
					  up=up+rev(temp);
				  }
			  }
		  if(s.charAt(i)!='w'&& s.charAt(i)!='e'&& s.charAt(i)!='l')
		  {
			  up=up+s.charAt(i);
		  }
	  }
	  System.out.println(up);
}
   static String rev(String x)
   {
 	String rev="";
 	for(int i=x.length()-1;i>=0;i--)
 	{
 		rev=rev+x.charAt(i);
 	}
 	return rev;
   }
}
