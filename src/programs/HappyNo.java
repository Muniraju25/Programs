package programs;

public class HappyNo {
  public static void main(String[] args) {
	int no=82;
	int copy=no;
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
	if(no==1)
	{
		System.out.println(copy+" is a happy number");
	}else {
		System.out.println(copy+" is not a happy number");
	}
}
}
