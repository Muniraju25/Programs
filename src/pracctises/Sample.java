package pracctises;

public class Sample {
  public static void main(String[] args) {
	String[] arr= {"haha","hello","hi","good","bye"};
	String max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(max.length()>arr[i].length())
		{
			max=arr[i];
		}
	}
	for(int i=0;i<arr.length;i++)
	{
		if(max.length()==arr[i].length())
		{
			System.out.println(arr[i]);
		}
	}
}
}
