interface par
{
    void father();
}
interface par2 
{
    void mother();
}

class pawan implements par,par2
{
    public void father()
    {
        System.out.println("father ");
    }
    public void mother()
    { 
        System.out.println("mother...........");
    }
}


public class Interface {

    public static void main(String[] args) {
        pawan ob=new pawan();
        ob.father();
        ob.mother();
    }
    
}
