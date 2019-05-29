import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int square;
    square=n*n;
  
  return square;
}
  
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner in= new Scanner(System.in);
      int m = in.nextInt();
      int sq = square(m);
      System.out.print(sq);
 
	} 
}