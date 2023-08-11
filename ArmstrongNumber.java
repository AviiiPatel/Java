public class ArmstrongNumber 
{
   
  public static void main(String[] args) 
  {
     int No=153;
     int x=No;
     int leng=0;
     while(x!=0)
     {  
        leng=leng+1;
        x=x/10;
 
     }

     int y=No;
     int z=0; 
     int rem;
     while(y!=0)
     {
         int mul=1;
         rem=y%10;
         for(int i=1;i<=leng;i++)
         {
            mul=mul*rem;
         }
         z=z+mul;
         y=y/10;
     }
     if(z==No)
     {
        System.out.println(No+" is armstrong number");
     }
     else
     {
        System.out.println(No+" is not a armstrong number");
     }

  }    
}
