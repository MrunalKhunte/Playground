import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n =in.nextInt() ; int sum=0;
      int count;
    //  for(int i=0;i<=n;i++);
      while(n>0)
      {
        count = n%10;
    
        sum = sum+count;
            n=n/10;
        
	}
      System.out.println(sum);
    
	    // Type your code here
	}
}