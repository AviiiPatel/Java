//using hash table 
//most effective method

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Find_Duplicate_3 
{
  public static void main(String[] args) 
  {
    int[] a={1, 6, 8, 10, 10, 8, 1, 24, 1};

    Map<Integer,Integer> hm=new HashMap<>();
    for(int no:a)
    {
        Integer count=hm.get(no);
        if(count==null)
        {
            hm.put(no,1);
        }
        else
        {
            count=count+1;
            hm.put(no,count);
        }
    }

    System.out.print("Duplicate elements are: ");
    Set<Map.Entry<Integer,Integer>> es=hm.entrySet();

    for(Map.Entry<Integer, Integer> me:es)
    {
        if(me.getValue()>1)
        {
            System.out.print(me.getKey()+" ");
        }
    }
  }    
}
