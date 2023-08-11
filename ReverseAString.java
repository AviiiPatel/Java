import java.util.Scanner;
public class ReverseAString 
{ 
   public static void main(String[] args) 
   {  
      String yn;
      do
      {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word=s.next();
        int length;
        length=word.length();
        String rev="";
        for(int i=length-1;i>=0;i--)
        {
            rev=rev+word.charAt(i);
        }
            System.out.println("reverse of word is " +rev);
            System.out.println("Do you want to continue(press y for yes and n for no)");
            yn=s.next();
      }
      while(yn.equals("y") | yn.equals("Y"));
   }
}  
