package oops;
public class methodoverriding {
    public static void main(String[] args) {
        St2 ob=new St2();
        ob.mark();
        ob.mark2();
    }
    
}

class St1
{
    void mark()
    {
        System.out.println(" 100..............");
    }
    void mark2()
    {
        System.out.println(" i am your mark2");
    }
    
}
class St2 extends St1
{
    void mark()
    {
        super.mark();
        System.out.println(" 200..............");
    }
    void mark2()
    {
        System.out.println(" i am your mark1");
    }

}

