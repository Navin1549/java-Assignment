abstract class KFC{
    KFC()
    {
        System.out.println("Main KFC");
    }
     void makeitem()
     {
         System.out.println("Make item");
     }
    abstract void billing();
    abstract void offer();
}

class Mykfc extends KFC
{
    void billing()
    {
        System.out.println("billing ");
    }
    void offer()
    {
        System.out.println("offer ");
    }
}


public class Example1 {
     public static void main(String[] args) {
         
        KFC sc= new Mykfc();
        sc.billing();
        sc.makeitem();
        sc.offer();
     }
    
}
