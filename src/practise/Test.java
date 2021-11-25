package practise;

public class Test {
   static int test(int no)
   {
	   int sum=0;
	   while(no!=0)
	   {
		   int rem=no%10;
		   sum=sum+rem;
		   no=no/10;
	   }
	   return sum;
   }
   public static void main(String[] args) {
	int t=568;
	int temp=t;
	while(temp>9)
	{
		temp=test(temp);
	}
	if(temp==1)
	{
		System.out.println("happy no");
	}else {
		System.out.println("Not a happy no");
	}
}
}
