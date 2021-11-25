package newpgms;

public class Demo {
    public static void main(String[] args) {
		String s="india";
		String n="";
		int no='i'-'a';
		//System.out.println(no);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='i')
			{
				char ch=(char) (s.charAt(i)-no);
				n=n+ch;
			}else {
				n=n+s.charAt(i);
			}
		}
		System.out.println(n);
	}
}
