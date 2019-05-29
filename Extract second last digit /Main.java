import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here 
      Scanner in = new Scanner(System.in);
      int N=in.nextInt();
    
    int N2=((N/10)%10);
  
    System.out.println(N2);
	}
}