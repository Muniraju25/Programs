package programs;

public class SumOfString1 {
   public static void main(String[] args) {
	String s="a1b34bt32";
	int sum=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='0' && s.charAt(i)<='9')
		{
			int no=s.charAt(i)-48;
			sum=sum+no;
		}
	}
	System.out.println(sum);
}
}
