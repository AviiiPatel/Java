public class Array2D 
{
  public static void main(String[] args) 
  {
     int[][] a={{6,10,24,25},{20,31},{12,13,3}};
     
     System.out.println(a);
     System.out.println("-------------------------------------------");
     System.out.println(a[0]);
     System.out.println("-------------------------------------------");
     System.out.println(a[0][0]);
     System.out.println("-------------------------------------------");
     System.out.println(a.length);
     System.out.println("-------------------------------------------");
     System.out.println(a[0].length);
     System.out.println("-------------------------------------------");

     for(int i=0;i<a.length;i++)
     {
        for(int j=0;j<a[i].length;j++)
        {
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
     }
  }    
}
