
abstract class ukfc
{
    
    void makeitem()
    {
        System.out.println("making item.........");
    }
    abstract void bill();
    
        
}
class myukfc extends ukfc
{
    void bill()
    {
        System.out.println("billing............");
    }
    void offer()
    {
        System.out.println("offer............");
    }
}

public class Abstraction {

   public static void main(String[] args) {
    ukfc ob;
       ob =new myukfc();
       ob.bill();
       //ob.offer();
       ob.makeitem();
   } 
    
}
