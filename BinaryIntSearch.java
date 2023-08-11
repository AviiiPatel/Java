public class BinaryIntSearch 
{
  public static void main(String[] args) 
  {
    int[] a={1, 3, 6, 8, 10, 13, 20, 22, 24, 25, 30};
    int li=0;
    int hi=a.length-1;
    int mi=(li+hi)/2;
    int x=6;  // value we wamt to search from array
    
    while(li<=hi)
    {
        if(a[mi]==x)
        {
          System.out.print(x+" is at "+mi+" index position");
          break;
        }  


        else if(a[mi]<x)
        li=mi+1;

        else
        hi=mi-1;

        mi=(li+hi)/2;
    }
    
    if(li>hi)
    System.out.print(x+" is not found");

   }  
}
