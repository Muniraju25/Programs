package newpgms;

public class Sample {
   public static void main(String[] args) {
	String s="IndIaN";
	String n="";
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>=65 && s.charAt(i)<=90)
		{
			n=n+((char)(s.charAt(i)+32));
		}else {
			n=n+s.charAt(i);
		}
	}
	System.out.println(n);
}
}
