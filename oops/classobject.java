package oops;
import java.util.Scanner;

class Student
{
    Scanner sc=new Scanner(System.in);
    String name;
    String roll_no;
    int mark;

    String getname()
    {
        System.out.println("Enter the Student name");
        name=sc.nextLine();
        return name;
    }
    String getroll()
    {
        System.out.println("Enter the Student roll no");
        roll_no=sc.nextLine();
        return roll_no;
    }
    int getmark()
    {
        System.out.println("Enter the Student marks");
        mark=sc.nextInt();
        return mark;
    }

}
class classobject{

    public static void main(String[] args) {
        Student stu=new Student();
        String sname=stu.getname();
        String sroll=stu.getroll();
        int smark=stu.getmark();

        System.out.println("Student Name : "+sname+"\nStudent Roll No : "+sroll+"\nStudent Mark : "+smark);

    }
}