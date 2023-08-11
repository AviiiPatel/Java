public class NumericPattern5 
{
 public static void main(String[] args) 
 {
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j);
        }
        for(int k=i;k>=2;k--)
        {
            System.out.print(k-1);
        }
        System.out.println();
    }
 }    
}

// 1
// 1 2 1 
// 1 2 3 2 1
// 1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1
