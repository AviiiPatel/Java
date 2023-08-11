public class InsertElementInArray 
{
  public static void main(String[] args) 
  {
    int[] a={1, 6, 10, 24, 25};
    
    int pos=3;
    int element=13;
    for(int i=a.length-1;i>pos-1;i--)
    {
        a[i]=a[i-1];
    }

    a[pos-1]=element;
    for(int i=0;i<a.length;i++)
    {
        System.out.print(a[i]+" ");
    }
  }    
}
