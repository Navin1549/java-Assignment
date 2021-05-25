package oops;

class Cow extends Animal
{
    void Cowrun()
    {
        System.out.println("Cow Running.....");
    }
}
class Cat extends Animal
{
    void Catrun()
    {
        System.out.println("Cat Running.....");
    }
}

class HierarchicalInheritance {

    public static void main(String[] args) {
        Cat ct=new Cat();
        Cow cw=new Cow();
        ct.Catrun();
        ct.eat();
        cw.Cowrun();
        cw.eat();
    }
    
}
