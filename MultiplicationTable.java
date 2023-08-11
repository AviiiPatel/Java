import java.util.Scanner;
public class MultiplicationTable 
{
    public static void main(String[] args) 
    { 
        String yn;
        do
        {
            Scanner s=new Scanner(System.in);
            System.out.print("enter any Number: ");
            int no=s.nextInt();
            for(int i=1;i<=10;i++)
            {
                System.out.println(no+" * "+i+" = "+no*i);
            }
            System.out.println("do you want to continue(press y for yes and n for no)");
            yn=s.next();
        }    
        while(yn.equals("y") || yn.equals("Y"));
    }    
}
