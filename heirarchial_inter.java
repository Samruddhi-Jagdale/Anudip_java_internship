class animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class dog extends animal{
    void bark(){
      System.out.println("Dog is barking");  
    }
}

class cat extends animal{
    void meow(){
        System.out.println("Cat is meowing");
    }
}


public class heirarchial_inter{
    public static void main(String[] args) {
        animal a =new animal();
        a.eat();

        dog d = new dog();
        d.eat();
        d.bark();
        
    
        cat c =new cat();
        c.eat();
        c.meow();
    }
}
