package programs;

public class AdditionOfGrpNo {
   public static void main(String[] args) {
	String s="a15gf25tr1";
	int num=0;
	int sum=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='0' && '9'>=s.charAt(i))
		{
			int no=s.charAt(i)-48;
			num=num*10+no;
		}else {
			sum=sum+num;
			num=0;
		}
	}
   sum=sum+num;
   System.out.println(sum);
}
}
