


class BabyDog extends Dog
{
    void BabyColor()
    {
        System.out.println("white......");
    }
}

class MultiLevelInheritance {
   
    public static void main(String[] args) {
        
        BabyDog bg=new BabyDog();
        bg.BabyColor();
        bg.DogColor();
        bg.eat();

    }
    
}
