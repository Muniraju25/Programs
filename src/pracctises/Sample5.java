package pracctises;

public class Sample5 {
  public static void main(String[] args) {
	  String s="welcome to tyss company";
	  String[] a = s.split(" ");
	  for(int i=a.length-1;i>=0;i--)
	  {
		  System.out.print(a[i]+" ");
	  }
}
}
