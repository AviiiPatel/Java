public class Second_small_element 
{
    public static void main(String[] args) 
    {
      int[] a={24, 25, 1, 6, 10, 8, 13};
      
      for(int i=0;i<a.length;i++)
      {
        for(int j=i+1;j<a.length;j++)
        {
            if(a[i]>a[j])
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
      }
      System.out.print("Second smallest number is "+a[1]);
    }
    
}
