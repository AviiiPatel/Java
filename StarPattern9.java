public class StarPattern9 
{
  public static void main(String[] args) 
  {
     for(int i=1;i<=5;i++)
     {
        for(int j=2;j<=i;j++)
        {
            System.out.print(" ");
        }
        for(int x=5;x>=i;x--)
        {
            System.out.print("*");
        }
        for(int y=4;y>=i;y--)
        {
            System.out.print("*");
        }
        System.out.println();
     }
  }    
}

// * * * * * * * * * 
//   * * * * * * *
//     * * * * * 
//       * * * 
//         *
