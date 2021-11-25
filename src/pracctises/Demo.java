package pracctises;

public class Demo {
    
	public static void main(String[] args) {
		int[] x= {50,69,10,12,5};
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]>x[j])
				{
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		//System.out.println(x[1]+" is the 2nd maximum number");
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+x[i];
		}
		System.out.println(sum);
	}
}
