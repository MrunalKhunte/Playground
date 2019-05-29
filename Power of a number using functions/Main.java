import java.util.Scanner;
class Main {
    
	public static int p(int b,int e)
    { int pow=1;
      for(int i=1;i<=e;i++)
      { 
       pow=pow*b;
      }
      return pow;
    }

	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int m = in.nextInt(); int n= in.nextInt();
      int power=p(m,n);
      System.out.print(power);
	}
}