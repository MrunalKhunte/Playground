import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
        int n ; 
      int num= in.nextInt();
      int count=1;
      for(n=1;n<=num;n=n+1)
      {
        System.out.println(count);
      
        count=count+2;
     
      }
	}
}