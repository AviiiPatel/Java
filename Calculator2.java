//if we want to ask user that user want to continue or not for that we just add do-while loop

import java.util.Scanner;
public class Calculator2
{
  public static void main(String[] args) 
   {
    String yn;
    do
    {
    Scanner s=new Scanner(System.in);

    System.out.println("Enter First Number:");
    int No1=s.nextInt();

    System.out.println("Enter Second Number");
    int No2=s.nextInt();

    System.out.println("Select Any Symbol (+,-,*,/,%)");
    String Sym=s.next();

    int res;
    switch(Sym)
      {
        case "+": res= No1+No2;
        System.out.println("Addition: "+res);
        break;

        case "-": res= No1-No2;
        System.out.println("Subtraction: "+res);
        break;

        case "*": res= No1*No2;
        System.out.println("Multiplication: "+res);
        break;

        case "/": res= No1/No2;
        System.out.println("Division: "+res);
        break;

        case "%": res= No1%No2;
        System.out.println("Modulo: "+res);
        break;
      }
        System.out.println("Do you want to continue(prss y for yes and n for no)");
        yn=s.next();
    }
    while(yn.equals("y") || yn.equals("Y"));
  }
}
