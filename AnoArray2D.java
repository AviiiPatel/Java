public class AnoArray2D 
{
   public static void main(String[] args) 
   {
     AnoArray2D.sum(new int[][]{{6,10,24,25},{6,10,24,25}}); 
   }   
   static void sum(int[][] no)
   {
    int total=0;
    for(int x[]:no)
    {
        for(int i:x)
        {
            total=total+i;
        }
    }
    System.out.println("sum is :"+total);
   }
}
