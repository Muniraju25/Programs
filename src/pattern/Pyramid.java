package pattern;

public class Pyramid {
   public static void main(String[] args) {
	int star=1;
	int space=2;
	for(int i=0;i<3;i++)
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=star;k++)
		{
		   System.out.print("*");	
		}
		System.out.println();
		star=star+2;
		space--;
	}
	int space1=1;
	int star1=3;
	for(int i=1;i<=2;i++)
	{
		for(int j=1;j<=space1;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=star1;k++)
		{
			System.out.print("*");
		}
		System.out.println();
		space1++;
		star1=star1-2;
	}
}
}
