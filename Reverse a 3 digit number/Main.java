import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here 
    Scanner in = new Scanner(System.in);
      int N=in.nextInt();
    int N1=N/100;
    int N2=((N/10)%10);
    int N3=N%10;
    int num=(N3*100)+(N2*10)+N1;
    System.out.println(num);
  }
}