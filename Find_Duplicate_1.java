//this method is not much effective coz if number is repeated more than two than this method print 
// that number nmore than one time 
//called as brute force method


public class Find_Duplicate_1 
{
  public static void main(String[] args) 
  {
    int[] a={3, 5, 4, 3, 2, 2, 1};

    System.out.print("Duplicate Elements are: ");
    for(int i=0;i<a.length-1;i++)
    {
      for(int j=i+1;j<a.length;j++)
      {
        if((a[i]==a[j]) && (i!=j))
        {
        System.out.print(a[i]+" ");
        }
      }
    }
  }    
}
