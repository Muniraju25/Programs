package programs;

public class StringPalindrome {
	public static void main(String[] args) {
		int no=121;
		int sum=0;
		int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum*10+rem;
			no=no/10;
		}
		if(sum==copy) {
		System.out.println(copy+" is a palindrome");
		}else {
			System.out.println(copy+" is not palindrome");
		}
	}
}
