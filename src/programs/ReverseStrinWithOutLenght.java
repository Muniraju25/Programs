package programs;

public class ReverseStrinWithOutLenght {
  public static void main(String[] args) {
	String s1="Hello";
	String rev="";
	int length=s1.compareTo(rev);
	for(int i=length-1;i>=0;i--)
	{
		rev=rev+s1.charAt(i);
	}
	System.out.println(rev);
}
}
