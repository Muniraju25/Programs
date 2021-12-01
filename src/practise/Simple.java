package practise;

public class Simple {
   public static void main(String[] args) {
	int x,y,z;
	x=20;
	y=30;
	z=10;
	int large=(x>y)?x:y;
	System.out.println("large="+large);
	large=(x>y)?(x>z?x:z):(y>z?y:z);
	System.out.println("large="+large);
}
}
