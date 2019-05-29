import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
       Scanner in = new Scanner(System.in);
      int N=in.nextInt();
    int N1=N/100;
    int N3=N%10;
    int num=N1+N3;
    System.out.println(num);
	}
}