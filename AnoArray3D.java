public class AnoArray3D 
{
  public static void main(String[] args) 
  {
    AnoArray3D.sum(new int[][][]{{{6,10,24,25},{6,10,24},{6,10,24,25}}});  
  }

static void sum(int[][][] no) 
{
    int total=0;
    for(int x[][]:no)
    {
        for(int y[]:x)
        {
            for(int z:y)
            {
                total=total+z;
            }
        }
    }
    System.out.println("sum is: "+total);
}    
}
