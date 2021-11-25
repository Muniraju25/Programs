package practise;

public class Deemo {
  public static void main(String[] args) {
	String s="a13b12c45";
	int sum=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='0'&& s.charAt(i)<='9')
		{
			int num=s.charAt(i)-48;
			sum=sum+num;
		}
	}
	System.out.println(sum);
}
}
