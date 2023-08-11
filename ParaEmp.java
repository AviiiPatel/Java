public class ParaEmp 
{  
   String name;
   int emp_id;

   ParaEmp(String name, int emp_id)
   {
    this.name=name;
    this.emp_id=emp_id;
   }
   public static void main(String[] args) 
   {
     ParaEmp emp1=new ParaEmp("messi",10);
     ParaEmp emp2=new ParaEmp("Aviii",25);
     
     System.out.println("employee 1: "+emp1.name+" "+emp1.emp_id);
     System.out.println("employee 2: "+emp2.name+" "+emp2.emp_id);

   }    
}
