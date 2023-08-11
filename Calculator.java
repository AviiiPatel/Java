import java.util.Scanner;
public class Calculator
{
  public static void main(String[] args) 
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

        default:
        System.out.println("invalid selection");
        break;
    }
  }
}
