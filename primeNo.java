import java.util.*;
class primeNo{
     static boolean prime(final int i) {
          if (i <= 1)
               return false;
          for (int p = 2; p < i; p++) {
               if (i % p == 0) {
                    return false;
               }
          }
          return true;
     }

     static void printprime(final int n, final int ft) {
          int p = 0, c = 0;

          for (int i = 2; i <= n; i++) {
               if (prime(i)) {
                    if (ft < i) {

                         p++;
                         System.out.println(i + " prime no.");
                    }
               } else {
                    if (ft < i) {
                         System.out.println(i + " composite no.");
                         c++;
                    }
               }
          }
          System.out.println("counting between two prime no : " + p);
          System.out.println("counting between two composite no : " + c);
     }

     static public void main(final String[] args) {
          final Scanner sc = new Scanner(System.in);

          final int first = sc.nextInt();
          final int num = sc.nextInt();
          printprime(num,first);

          sc.close();

     }
}