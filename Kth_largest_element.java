public class Kth_largest_element 
{
  public static void main(String[] args) 
  {
    int[] a={1, 24, 25, 8, 6, 10, 20};

    int k=4;
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

        if(i==k-1)
        {
            System.out.println(k+"th largest element is "+a[i]);
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
