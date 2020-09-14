/*find the area and perimeter using shape abstract class . shape extends in circle and rectangular class */
import java.util.*;
abstract class shape
{
    abstract double perimeter();
    abstract double area();
}

class circle extends shape
{   
    int radius;
    double perimeter()
    {
        double primt =2*Math.PI*radius;
        return primt;
    }
    double area()
    {
        double area= Math.PI*radius*radius;
        return area;
    }
}
;
class rectangular extends shape
{   
    int len, bre;
    double perimeter()
    {
        double primt =2*len+2*bre;
        return primt;
    }
    double area()
    {
        double area=len*bre;
        return area;
    }

}

public class studentTask {
    public static void main(final String[] args) {
         Scanner sc = new Scanner(System.in);
         rectangular r = new rectangular();
         circle c = new circle();
         System.out.println("Enter the length Value : ");
         r.len = sc.nextInt();
         System.out.println("Enter the breadth Value : ");
         r.bre = sc.nextInt();
         System.out.println("Enter the Radius Value : ");
         c.radius = sc.nextInt();
         shape sr=r;
         shape sd=c;
        
         System.out.println("Area of Rectangular : "+sr.area());
         System.out.println("Perimeter of Rectangular : "+sr.perimeter());
         System.out.println("Area of Circle : "+sd.area());
         System.out.println("Perimeter of Circle : "+sd.perimeter());
         sc.close();
    }
    
}
