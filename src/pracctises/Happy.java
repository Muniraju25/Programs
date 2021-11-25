package pracctises;

public class Happy {
 public static void main(String[] args) {
	int no=82;
	
	while(no>9)
	{
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		no=sum;
	}
	System.out.println(no);
}
}
