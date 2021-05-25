package oops;

class Animal
{
    void eat()
    {
        System.out.println("Eating.............!");
    }
}
class Dog extends Animal
{
    void DogColor()
    {
        System.out.println("Brown......");
    }
}


class SingleInheritance {

    public static void main(String[] args) {
        
        Dog dg=new Dog();
        dg.DogColor();
        dg.eat();

    }
    
}
