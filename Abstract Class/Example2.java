

abstract class Supersm
{
    public Supersm() { System.out.println("Super Constructor"); }
    
    public void meth1()
    {
        System.out.println("Meth1 of Super");
    }
    
    abstract public void meth2();
}

class ram extends Supersm
{
    //Override
    public void meth2()
    {
        System.out.println("Sub meth2");
    }
}

public class Example2 {
    public static void main(String[] args) 
    {
        Supersm s=new ram();
        
        s.meth1();
        s.meth2();
        
    }    
}
