package Array;
import java.util.*;

public class insertElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array of Length : ");
        int al=sc.nextInt();
       int [] arr=new int[al];
        for(int x=0;x<arr.length;x++)
        {
            System.out.print("Enter the Element in Index "+x+" : ");
            
            arr [x]=sc.nextInt();
            System.out.println("");
        }

        //int arr[]={4,6,7,8,10};
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        sc.close();
    }
    
}
