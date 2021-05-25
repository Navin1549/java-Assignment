

 class Studet 
 {
     private String s_name;
     private int s_age;

     public String getname()
     {
         return s_name;
     }
     public int getage()
     {
         return s_age;
     }
     public void setname(String str)
     {
         s_name=str;
     }
     public void setage(int age)
     {
         s_age=age;
     }
    
}
class Encapsulation
{
    public static void main(String[] args) {
        Studet st=new Studet();
        st.setname("pawan");
        st.setage(22);
        int ag=st.getage();
        String nm=st.getname();
        System.out.println(ag+" "+ nm);
    }
}
