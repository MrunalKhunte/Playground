import java.util.Scanner;
class Main {
	public static void main (String[] args){
      int number, first_digit; int second_digit;
	Scanner in = new Scanner(System.in);
	
		number = in.nextInt();	

		first_digit = number;
		while(first_digit >= 100)
		{
			first_digit = first_digit /10;
		}	
		
    second_digit=first_digit %10;
      
		System.out.println(second_digit);

     // Type your code here
	}
}