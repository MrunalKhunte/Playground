import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
        int n ; int num = in.nextInt();
      int sum =0;
      for(n=0;n<=num;n++)
      {
        sum=sum+n;
      }
      System.out.println(sum);
	}
}