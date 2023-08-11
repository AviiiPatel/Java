public class StarPattern11 
{
  public static void main(String[] args) 
  {
    for(int i=1;i<=5;i++)
    {
        for(int j=4;j>=i;j--)
        {
            System.out.print(" ");
        }
        for(int x=1;x<=1;x++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
  }    
}

//         *
//       *
//     *
//   *
// *
