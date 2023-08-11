public class StarPattern12 
{
   public static void main(String[] args) 
   {
     for(int i=1;i<=5;i++)
     {
      for(int j=2;j<=i;j++)
      {
         System.out.print(" ");
      }
      for(int k=11;k>i*2;k--)
      {
         if(k<11 && k>i*2+1)
         {
            System.out.print(" ");
         }
         else
         {
            System.out.print("*");
         }
      }
      System.out.println();
     }    
   }
}

// *               *
//   *           *           
//     *       *  
//       *   *
//         *
