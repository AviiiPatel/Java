public class Second_large_element 
{
  public static void main(String[] args) 
  {
    int[] a={1, 6, 8, 24, 25, 10, 13};
    
    for(int i=0;i<a.length;i++)
    {
        for(int j=i+1;j<a.length;j++)
        {
            if(a[i]<a[j])
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    System.out.print("second largest element is "+a[1]+".");
  }    
}
