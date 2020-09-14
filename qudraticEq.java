import java.util.Scanner;
class qudraticEq{
    static public void equal(int a,int b)
    { int root =(-b)/(2*a);
         System.out.println("root 1 :" + root);
         System.out.println("root 2 :" + root);
    }

    static public void enequal(int a, int b,int c,double dis)
    {
        double root1 =  (-b + Math.sqrt(dis))/(2*a);
        double root2 =  (-b - Math.sqrt(dis))/(2*a);
        System.out.println("root 1 :" + root1);
        System.out.println("root 2 :" + root2);

            }

    static public void Dicrmt(int a,int b,int c)
    { double dis;
        dis= ((b*b)-(4*a*c));
        if(dis>0){
        System.out.println("roots are unequal value ");
        enequal(a,b,c,dis);}
        if(dis<0){
        System.out.println("root are imagenary");}
        if(dis==0){
        System.out.println("two roots are equal ");
         equal(a,b);
        }


    }
    static public void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the A num : ");
        int a=sc.nextInt();
        System.out.println("Enter the B num : ");
        int b=sc.nextInt();
        System.out.println("Enter the C num : ");
        int c=sc.nextInt();
        Dicrmt(a,b,c);
        
        
        
        sc.close();
        
        
    }
}