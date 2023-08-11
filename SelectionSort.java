public class SelectionSort 
{
  public static void main(String[] args) 
  {   
      int[] a={38,52,9,18,6,62,13};
      int x;
      int temp;
      for(int i=0;i<a.length;i++)
      { 
        x=i;
        for(int j=i+1;j<a.length;j++)
        {
            if(a[j]<a[x])
            {
                x=j;
            }
        }
        temp=a[i];
        a[i]=a[x];
        a[x]=temp;
      }  
      for(int i=0;i<a.length;i++)
      {
        System.out.print(a[i]+" ");
      }
  }  
}
