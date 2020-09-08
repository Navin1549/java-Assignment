package Array;
import java.util.*;

public class secondLargeNo 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array of Length : ");
        int al=sc.nextInt();
       int [] arr=new int[al];
        for(int x=0;x<arr.length;x++)
        {
            System.out.print("Enter the Element in Index "+x+" : ");
            
            arr [x]=sc.nextInt();
            
        }
        System.out.println("------------------------");
        int max1 = 0;
        int max2=0;

        for(int r:arr)
        {
            if(max1<r)
            {   max2=max1;
                max1=r;
            }
            else if(max2<r)
            {
                max2=r;
            }
            System.out.print(r+" ");
        }
        System.out.println("");
        System.out.println("------------------------");
       System.out.println("The Largest Element of Array : " +max1);
       System.out.print("The Second Largest Element of Array : " +max2);

        sc.close();
    }
    
}
