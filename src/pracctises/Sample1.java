package pracctises;

public class Sample1 {
  public static void main(String[] args) {
	  String[] arr= {"haha","hello","hi","good","bye"};
	  for(int i=0;i<arr.length;i++)
	  {
		  for(int j=i+1;j<arr.length;j++)
		  {
			  if(arr[i].compareTo(arr[j])>0)
			  {
				  String temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
			  }
		  }
	  }
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.print(arr[i]+" ");
	  }
	 /* String s="acde";
	  String x="z";
	  int n=s.compareTo(x);
	  System.out.println(n);*/
}
}
