package newpgms;

public class Repeat {
  public static void main(String[] args) {
	String s="a2b3c4";
	String up="";
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='0' && '9'>=s.charAt(i))
		{
			int count=s.charAt(i)-48;
			for(int k=0;k<count;k++)
			{
				up=up+s.charAt(i-1);
			
			}
		}
	}
	System.out.println(up);
}
}
