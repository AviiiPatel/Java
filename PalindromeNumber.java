import java.util.Scanner;
public class PalindromeNumber 
{
    public static void main(String[] args) 
    {
       String yn;
       do
       {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number:");
        int No=s.nextInt();
        int rem,rev=0;
        int x=No;
        while(No!=0)
        {
           rem=No%10;
           rev=rev*10+rem;
           No=No/10;
        }
        System.out.println(rev);
        if(rev==x)
        {
            System.out.println("Number is palindrome");
        }
        else 
        {
            System.out.println("Number is not palindrome");
        }
        System.out.println("Do you want to continue(press y for yes and n for no)");
        yn=s.next();
     }
     while(yn.equals("y") | yn.equals("Y"));   
    }
}
