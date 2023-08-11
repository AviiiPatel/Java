public class Find_Single_Repeated 
{
  public static void main(String[] args) 
  {
    int[] a={1, 6, 10, 25, 6, 10, 1};
  
    int res=a[0];
    for(int i=1;i<a.length;i++)
    {
        res=res^a[i];
    }
      
    System.out.print("Single element in repeated arrat is: "+res);  
  }   
}
