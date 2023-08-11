public class StarPattern7 
{
   public static void main(String[] args) 
   {
    for(int i=1;i<=4;i++)
    {
        for(int y=3;y>=i;y--)
        {
            System.out.print(" ");
        }
        for(int x=1;x<=i;x++)
        {
            System.out.print(" *");
        }
        System.out.println();
    }
   }    
}


//    *
//   * *
//  * * *
// * * * *
