//this method is called as collection method 

import java.util.HashSet;
public class First_Duplicate_2 
{
    public static void main(String[] args) 
    {  
       int temp=-1;
       HashSet<Integer> hm=new HashSet<>();
       int[] a={1, 6, 8, 10, 24, 10, 25, 6};

       for(int i=a.length-1;i>=0;i--)
       {
          if(hm.contains(a[i]))
          {
            temp=i;
          }
          else
          {
            hm.add(a[i]);
          }
       }

       if(temp==-1)
       {
        System.out.print("No Duplicate element is found");
       }
       else
       {
        System.out.print("First Duplicate element is "+a[temp]);
       }

    }
    
}
