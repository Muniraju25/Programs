package programs;

public class SumOfString {
  public static void main(String[] args) {
	String s="123456";
	int sum=0;
	int no=Integer.parseInt(s);
	while(no!=0)
	{
		int rem=no%10;
		sum=sum+rem;
		no=no/10;
	}
	System.out.println(sum);
}
}
