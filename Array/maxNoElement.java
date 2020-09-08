package Array;
import java.util.*;

public class maxNoElement {
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
        int max = 0;

        for(int r:arr)
        {
            if(max<r)
            {
                max=r;
            }
            System.out.print(r+" ");
        }
        System.out.println("");
        System.out.println("------------------------");
        System.out.print("The Maximum Element of Array : " +max);
        sc.close();
    }

    
}
