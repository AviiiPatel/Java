public class InsertionSort 
{
    public static void main(String[] args) 
    {
      int[] a={5,1,6,2,4,3};
      int x;
      int j;
      
      for(int i=1;i<a.length;i++)
      { 
        x=a[i];
        j=i;
        while (j>0 && x<a[j-1]) 
        {
            a[j]=a[j-1];
            j=j-1;
            
        }
        a[j]=x;

      }
      for(int i=0;i<a.length;i++)
      {
        System.out.print(a[i]+" ");
      }
    }

}
