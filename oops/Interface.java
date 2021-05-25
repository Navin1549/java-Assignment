interface parent1
{
    void father();
}
interface parent2 
{
    void mother();
}

class pawan implements parent1,parent2
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
