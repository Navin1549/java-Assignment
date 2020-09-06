//Question_2 Solution

class Calculation {
    int a,b,c;
    public Calculation(int i, int j, int k) {
       a=i;
       b=j;
       c=k;
    }

    public void sum(){
        System.out.println("sum : "+ (a+b+c));
    }

        
    

    public static void main(String[] args) {
        
         Calculation sc=new Calculation(10,25,30);
         sc.sum();
        

         
    }
    
}
