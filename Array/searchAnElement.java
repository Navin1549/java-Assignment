package Array;
import java.util.*;

public class searchAnElement {
    public static void main(String[] args)
    {
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
        System.out.print("Enter the search Element : ");
        int search= sc.nextInt();

        for(int s:arr)
        {
            if(search==s){
            System.out.print("Element "+search+" is Found.");
            System.exit(0);
            }

            
        }
        System.out.print("Element "+search+" is Not Found.");
        sc.close();
    }
    
}
