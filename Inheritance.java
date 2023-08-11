//inheritance used to inheriting properties of parent class into child class

public class Inheritance 
{
    void eat()
    {
        System.out.println("i am eating");
    }

}
class Dog extends Inheritance
{   
   
    public static void main(String[] args) 
    {
        Dog bruno=new Dog();
        bruno.eat();
    }
}