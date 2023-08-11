import java.util.Scanner;
public class PrimeNo 
{
    public static void main(String[] args) 
    { 
      String yn;
      do
      {  
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int No=s.nextInt();
        int temp=0;
        for(int i=2;i<=No-1;i++)
        {
            if(No%i==0)
            {
                temp=temp+1;
            }
        }
        if(temp>0)
        {
            System.out.println("Number is not prime");
        }
        else
        {
            System.out.println("Number is prime");
        }
       System.out.println("Do you want to continue(press y for yes and n for no)");
       yn=s.next();
    }
    while(yn.equals("y") | yn.equals("Y"));
    }
}
