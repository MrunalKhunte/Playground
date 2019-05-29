import java.util.Scanner;
class Main {
	public static void main (String[] args){
      int number, first_digit,N; int second_digit;
	Scanner in = new Scanner(System.in);
	
		number = in.nextInt();	
		N=number%10;
		first_digit = number;
		while(first_digit >= 10)
		{
			first_digit = first_digit /10;
		}	
		
    second_digit=first_digit %10;
      int sum = N + second_digit;
		System.out.println(sum);

     // Type your code here
	}
}