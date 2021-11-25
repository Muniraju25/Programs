package programs;

public class Fibonacci {
  public static void main(String[] args) {
	  //step-1:Declare and initialize the variable
	int a=0;
	int b=1;
	int c;
	//step-2:Print the a and b variables
	System.out.println(a);
	System.out.println(b);
	//step-3:Add two variables and store it in 3rd variable and print it
	for(int i=1;i<5;i++)
	{
	  c=a+b;
	  System.out.println(c);
	  a=b;
	  b=c;
	}
}
}
