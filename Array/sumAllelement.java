package Array;
import java.util.*;

public class sumAllelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array of Length : ");
        int al=sc.nextInt();
       int  arr[]=new int[al];
       for(int i=0;i<arr.length;i++)
       {
        System.out.print("Enter the Element in Index "+i+" : ");
           arr[i]=sc.nextInt();
       }
       int Sum=0;
       for(int x:arr)
       {
           Sum=Sum+x;
       System.out.print(x +" ");

       }
       System.out.println("");
       System.out.print("Sum of Total Element : "+Sum);

       sc.close();
    }
    
}
