package programs;

public class Ovals {
  public static void main(String[] args) {
	String s="PrAtheeksha";
	String n=s.toLowerCase();
	String oval="";
	for(int i=0;i<s.length();i++)
	{
		
		if(n.charAt(i)=='a'||n.charAt(i)=='e'||n.charAt(i)=='i'||n.charAt(i)=='o'||n.charAt(i)=='u') {
			oval=oval+s.charAt(i);
		}
	}
	System.out.println(oval);
}
}
