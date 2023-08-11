public class SelectionSortString 
{
    public static void main(String[] args) 
  {   
      String[] a={"Om","Swara","Messi","Anahita","Aviii"};
      int x;
      String temp="";
      for(int i=0;i<a.length;i++)
      { 
        x=i;
        for(int j=i+1;j<a.length;j++)
        {
            if(a[j].compareTo(a[x])<0)
            {
                x=j;
            }
        }
        temp=a[i];
        a[i]=a[x];
        a[x]=temp;
      }  
      for(int i=0;i<a.length;i++)
      {
        System.out.print(a[i]+" ");
      }
  } 
    
}
