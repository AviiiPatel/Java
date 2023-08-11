public class First_Duplicate_1 
{
    public static void main(String[] args) 
    {
      int[] a={1, 6, 8, 10, 24, 10, 25, 6};
      int temp=0;
      for(int i=0;i<a.length-1;i++)
      { 
        for(int j=i+1;j<a.length;j++)
        {
            if(a[i]==a[j])
            {
                System.out.print("first duplicate element is "+a[i]);
                temp=temp+1;
                break;
            }
        }
        if(temp==1)
        break;
    
      }
    }
    
}
