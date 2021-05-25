
class parent1
{
    void father()
    {
        System.out.println("I am your father");
    }
}
class parent2
{
    void mother()
    {
        System.out.println("I am your mother");
    }
}
// compiler error because java not support multiple InheritenceS
class child extends parent1//, parent2
{
    void raju()
    {
        System.out.println("I am your Child ");
    }
}
class MultilInheritance {
    public static void main(String[] args) {
        child ch=new child();
        ch.father();
        ch.raju();
    }
    
}
