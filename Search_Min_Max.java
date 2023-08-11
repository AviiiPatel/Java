public class Search_Min_Max 
{
  public static void main(String[] args) 
  {
    int[] a={6, 10, 1, 13, 22, 24, 25};
    
    int max=a[0];
    for(int i=1;i<a.length;i++)
    {
        if(a[i]>max)
        max=a[i];
    }
    System.out.println("maximum element is "+max);

    int min=a[0];
    for(int i=1;i<a.length;i++)
    {
        if(a[i]<min)
        min=a[i];
    }
    System.out.print("minimum element is "+min);
 }    
}
