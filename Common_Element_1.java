import java.util.HashSet;
public class Common_Element_1 
{ 
  public static void main(String[] args) 
  {
    int[] arr1={1, 6, 8, 10, 24, 25};
    int[] arr2={24, 20, 31, 7, 6, 10, 6};
    HashSet<Integer> hs=new HashSet<>();

    for(int i=0;i<arr1.length;i++)
    {
        for(int j=0;j<arr2.length;j++)
        {
            if(arr1[i]==arr2[j])
            {
               hs.add(arr1[i]);
               break;
            }
        }

    }
    for(int no:hs)
    {
        System.out.println(no);
    }
  }    
}
