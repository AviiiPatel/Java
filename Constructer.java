// there are three type of constructer 
//when we does not define any type of constructer compiler automatically define constructer called default constructer

public class Constructer 
{
    int i;
    String s;

    public static void main(String[] args) 
    { 
      Constructer c=new Constructer();
      System.out.println(c.i +" and "+c.s);  
    }
}
