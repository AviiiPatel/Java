//here we have to check whether no is repeated more than two times or not.
//iff number is repeated more than two tims than this method print that number more than one time
//so this method id not much effactive.
//but this method is faster than brut force method.
// using set interface...
import java.util.Set;
import java.util.HashSet;

public class Find_Duplicate_2 
{
  public static void main(String[] args) 
  {
    int[] a={1, 6, 8, 10, 24, 10, 6, 8};

    Set<Integer> s=new HashSet<>();
    System.out.print("Duplicate numbers are: ");
    for(int no:a)
    {   
        boolean b=s.add(no);
        if(b==false)
        {
            System.out.print(no+" ");
        }
        
    }
  }    
}
