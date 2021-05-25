package oops;
public class methodoverloading {
    public static void main(String[] args) {
        Adder ad=new Adder();
        int a=ad.add(15,20);
        Double b=ad.add(15.2,20.5);
        System.out.println(a+" "+b);
        
    }
    
}
class Adder
{
    int add( int a,int b)
    {
        return a+b;
    }
    Double add( Double a,Double b)
    {
        return a+b;
    }
}
