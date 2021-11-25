package hpgms;

public class Demo {
 public static void main(String[] args) {
	String[] a = {"Hi","hello","bye","p","tyss","mango"};
	String max=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i].length()>max.length())
		{
			max=a[i];
		}
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i].length()==max.length())
		{
			System.out.println(a[i]);
		}
	}
}
}
