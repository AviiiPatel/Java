public class Kth_smallest_element 
{
  public static void main(String[] args) 
  {
    int[] a={24, 25, 10, 6, 1, 8, 3, 20, 13};

    int k=3;
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
        if(i==k-1)
        {
          System.out.println(k+"th smallest element is "+a[i]);
          break;
        }
    }
    
    System.out.println("----------------");
    for(int i=0;i<a.length;i++)
    {
        System.out.print(a[i]+" ");
    }
  }   
}
