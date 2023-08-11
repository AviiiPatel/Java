public class LinearStringSearch 
{
  public static void main(String[] args) 
  {
    String[] a={"Aviii", "Swara", "Messi", "Ayan", "Om"};
    
    String x="Swara";
    int y=0;
    for(int i=0;i<a.length;i++)
    {
        if(a[i].equals(x))
        {
            System.out.print(x+" is present at "+i+" index position");
            y=y+1;
        }
    }
    if(y==0)
    System.out.print("String is not present in array");
  }  
}
