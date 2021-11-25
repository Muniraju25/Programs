package hpgms;

public class Demo1 {
  public static void main(String[] args) {
	String[] s= {"manual","sql","selenium","java"};
	for(int i=0;i<s.length;i++)
	{
		for(int j=i+1;j<s.length;j++)
		{
			if(s[i].compareTo(s[j])>0)
			{
				String temp=s[i];
				s[i]=s[j];
				s[j]=temp;
			}
		}
	}
	System.out.println(s[0]);
}
}
