package newpgms;

public class Demo23 {
  public static void main(String[] args) {
	String s1="welcome";
	String s2="";
	for(int i=0;i<s1.length();i++)
	{
		if(s1.charAt(i)=='c')
		{
			s2=s2+s1.charAt(i+1);
		}else if(s1.charAt(i)=='o') {
			s2=s2+s1.charAt(i-1);
		}else {
			s2=s2+s1.charAt(i);
		}
	}
	System.out.println(s2);
}
}
