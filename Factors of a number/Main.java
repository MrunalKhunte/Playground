import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int Num = in.nextInt();
     
      for(int fact=1;fact<=Num;fact++)
      {
        if(Num%fact==0)
        
          System.out.println(fact);
         
    }
   }

}