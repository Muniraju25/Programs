package programs;

public class ReverseWordInSentence {
	 public static void main(String[] args) {
			String s1="india";
			String rev="";
			for(int i=0;i<s1.length();i++)
			{
				rev=rev+s1.charAt(i);
				System.out.println(rev);
			}
		
		}
}
