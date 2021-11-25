package hpgms;

public class Samplee {
  public static void main(String[] args) {
	  String s="aaabbbcccc";
      char[]  x=s.toCharArray();
          for(int i=0;i<s.length();i++)
             {
              int count=0;
              if(s.charAt(i)!=s.charAt(i+1))
              {
               for(int j=0;j<x.length;j--)
                  {
                   
                    if(s.charAt(i)==x[i])
                    {
                    	count++;
                    }
                  }
              }
              System.out.println(s.charAt(i)+"-"+count);
             }
          
}
}
