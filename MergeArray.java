

public class MergeArray 
{
  public static void main(String[] args) 
  {
    int[] a={6, 10, 13, 20};
    int[] b={1, 24, 25, 30, 31};

    int a_len=a.length;
    int b_len=b.length;
    int c_len=a_len+b_len;

    int[] c=new int[c_len];

    for(int i=0;i<a.length;i++)
    {
        c[i]=a[i];
    }

    for(int i=0;i<b.length;i++)
    {
        c[a.length+i]=b[i];
    }
 
    for(int i=0;i<c.length;i++)
    {
        System.out.print(c[i]+", ");
    }
    
  
  }    
}
