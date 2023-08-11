public class LinearIntSearch 
{
  public static void main(String[] args) 
  {
    int[] a={1, 6, 10, 13, 24, 25, 30};
    
    int x=10;
    int y=0;
    for(int i=0;i<a.length;i++)
    {
        if(a[i]==x)
        {
            System.out.print("element "+x+" is persent at "+i+" index position");
            y=y+1;
        }
    }
    if(y==0)
    System.out.println("element is not present in array");
  }  
}
