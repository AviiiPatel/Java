import java.util.ArrayList;

public class Even_Odd_Numbers 
{
  public static void main(String[] args) 
  {
    int[] a={1, 6, 8, 10, 13, 24, 25};

    ArrayList<Integer> a1=new ArrayList<>();
    ArrayList<Integer> a2=new ArrayList<>();

    for(int i=0;i<a.length;i++)
    {
        if(a[i]%2==0)
        {
            a1.add(a[i]);
        }
        else
        {
            a2.add(a[i]);
        }
    }
    
    int total1=0;
    System.out.println("Even Numbers are: ");
    for(int no:a1)
    {
        System.out.print(no+" ");
        total1=total1+no;
    }
    
    System.out.print("\nTotal number of even no's are: "+a1.size());
    System.out.print("\nSum of all even numbers is: "+total1);
    System.out.println("\n");

    int total2=0;
    System.out.println("Odd Numbers are: ");
    for(int no:a2)
    {
        System.out.print(no+" ");
        total2=total2+no;
    }
    
    System.out.print("\nTotal number of odd no's are: "+a1.size());
    System.out.print("\nSum of all odd numbers is: "+total2);

  }    
}
