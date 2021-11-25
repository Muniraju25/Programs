package practise;

import java.util.Scanner;



public class Demo23 {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] a= {10,20,30,40,50};
	System.out.println("Enter the key");
	int key=sc.nextInt();
	for(int i=0;i<key;i++)
	{
		int temp=a[0];
		for(int j=0;j<a.length-1;j++)
		{
			a[j]=a[j+1];
		}
		a[a.length-1]=temp;
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	sc.close();
}
}
