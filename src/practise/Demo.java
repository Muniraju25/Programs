package practise;

public class Demo {
 public static void main(String[] args) {
	 String[] a = {"hi","Hello","bye","p","tyss","mango"};
	 String min=a[0];
	 for(int i=1;i<a.length;i++)
	 {
		 if(a[i].length()<min.length())
		 {
			 min=a[i];
		 }
	 }
	 for(int i=0;i<a.length;i++)
	 {
		 if(min.length()==a[i].length())
		 {
			 System.out.println(a[i]);
		 }
	 }
}
}
