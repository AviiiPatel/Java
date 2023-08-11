public class StarPattern6 
{
   public static void main(String[] args) 
   {
     for(int i=1;i<=5;i++)
     {
        for(int y=4;y>=i;y--)
        {
            System.out.print(" ");
        }
        for(int x=1;x<=i;x++)
        {
            System.out.print("*");
        }
        System.out.println();
     } 
     for(int z=1;z<=4;z++)
     {
        for(int a=1;a<=z;a++)
        {
            System.out.print(" ");
        }
        for(int r=4;r>=z;r--)
        {
            System.out.print("*");
        }
        System.out.println();
     }
   }    
}


//         * 
//       * * 
//     * * *
//   * * * * 
// * * * * *
//   * * * *
//     * * * 
//       * * 
//         * 
