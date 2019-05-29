import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
       Scanner in = new Scanner(System.in);
      int N=in.nextInt();
    int N2=((N/10)%10);
    int N3=N%10;
    int num=N2+N3;
    System.out.println(num);
	}
}