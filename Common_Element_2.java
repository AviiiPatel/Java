import java.util.HashSet;

public class Common_Element_2
{
  public static void main(String[] args) 
  {
    int[] arr1={1, 6, 8, 10, 24, 25};
    int[] arr2={24, 20, 31, 7, 6, 10, 6};

    HashSet<Integer> hs1=new HashSet<>();
    HashSet<Integer> hs2=new HashSet<>();
    
    for(int no:arr1)
    {
        hs1.add(no);
    }
    for(int no:arr2)
    {
        hs2.add(no);                                  
    }
    for(int no:hs2)
    {
        boolean b=hs1.add(no);
        if(b==false)
        System.out.println(no);
    }  
  }    
}
