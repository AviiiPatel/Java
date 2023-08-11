import java.util.Scanner;
public class ReverseANumber 
{
    public static void main(String[] args) 
    {  
       String yn;
       do
       {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int No=s.nextInt();
        int rem,rev=0;
        while(No!=0)
        {
            rem=No%10;
            rev=rev*10+rem;
            No=No/10;
        }
        System.out.println(rev);
        System.out.println("do you want to continue(press y for yes and n for no)");
        yn=s.next();
       }
       while(yn.equals("y") | yn.equals("Y"));   
    }
}
