import java.util.Scanner;
public class Factorial 
{
   public static void main(String[] args) 
   {
       String yn;
       do
       {
            Scanner s=new Scanner(System.in);
            System.out.print("enter any number: ");
            int No=s.nextInt();
            int x=1;
            for(int i=1;i<=No;i++)
            {
                x=x*i;
            }  
            System.out.println("factorial of given number: "+x);
            System.out.println("do you want to continue(write y for yes and n for no)");
            yn=s.next();
       } 
        while(yn.equals("y") || yn.equals("Y"));
   }    
}
