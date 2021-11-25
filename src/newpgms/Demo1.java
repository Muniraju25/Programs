package newpgms;

public class Demo1 {
  public static void main(String[] args) {
	String s="welcome";
	String updated="";
	for(int i=0;i<s.length();i++)
	{
		String temp=""+s.charAt(i);
		for(int j=i+1;j<s.length();j++)
		{
		   temp=temp+s.charAt(j);
		   if(temp.equals("co"))
		   {
			   updated=updated+rev(temp);
		   }
		}
		if(s.charAt(i)!='c'&& s.charAt(i)!='o')
		{
		updated=updated+s.charAt(i);
		}
	}
	System.out.println(updated);
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
