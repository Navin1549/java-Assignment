package Array;
import java.util.*;
public class rotateArray
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
        for(int r:arr)
        {
            
            System.out.print(r+" ");
        }
        System.out.println("");
        System.out.println("------------------------");

        int temp=arr[0];
        for(int n=1;n<arr.length;n++)
        {
            arr[n-1]=arr[n];
        }
        arr[arr.length-1]=temp;
        for(int m:arr)
        {
            System.out.print(m+" ");
        }
        
        
        sc.close();
    }

    
}
