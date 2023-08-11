public class AnoArray 
{
   public static void main(String[] args) 
   {
     AnoArray.sum(new int[]{6,10,24,25}); 
   }  
   static void sum(int[] no)
   {
    int total=0;
    for(int i:no)
    {
        total=total+i;
    }
    System.out.println("sum is: "+total);
   }
}
