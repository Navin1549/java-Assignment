// class ,object and methods question.
import java.util.Scanner;

class Student{
    float per;

    public void totalMarks(int s1,int s2,int s3){
        int total;
        
        total = s1+s2+s3;
        per = (total/3);
        System.out.println("Total Marls :"+total);
        System.out.println("Total Percentage :"+per+" %");
        }
    public void getstuData(int id,String name){
        System.out.println("Student ID : "+id);
        System.out.println("Student name : "+name);

    }

    public void  getstuMarks(int s1,int s2,int s3){

        System.out.println("Math : "+s1);
        System.out.println("Scince : "+s2);
        System.out.println("English : "+s3);
        totalMarks(s1,s2,s3 );
        


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student st= new Student();
        int sid,sub1,sub2,sub3;
        String Sname;
        //int t= sc.nextInt();
        
        
            System.out.print("Enter Student ID :");
            sid = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Student Name :");
            Sname =sc.nextLine();
            System.out.print("Math Marks:");
            sub1 =sc.nextInt();
            System.out.print("Science Marks:");
            sub2 =sc.nextInt();
            System.out.print("English Marks:");
            sub3 =sc.nextInt();
            System.out.println("-------------------------------------------");
            st.getstuData(sid,Sname);
            st.getstuMarks(sub1,sub2,sub3);
            //st.totalMarks( );
            System.out.println("-------------------------------------------");
    

      sc.close();

    }
}