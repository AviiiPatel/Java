import java.util.Scanner;
public class FactorialByRecursion2 
{   
    public static void main(String[] args) 
    {
          Scanner s=new Scanner(System.in);
          System.out.print("enter the no: ");
          int no=s.nextInt();
          int fact;
          FactorialByRecursion2 ob=new FactorialByRecursion2();
          fact=ob.calcFact(no);
          System.out.println("factorial of "+no+" is " +fact);
    }
    int calcFact(int no)
    {
        if(no>=1)
        {
            return (no*calcFact(no-1));
        }
        return 1;
    }
}
