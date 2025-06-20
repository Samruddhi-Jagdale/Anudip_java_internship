 class animal {
    void eat(){
        System.out.println("Animal is eating");
    }
    
}

class dog extends animal{
    void bark(){
        System.out.println("dog is barking");
    }
}

class puppy extends dog{
    void bhou(){
        System.out.println("Puppy is bhouing");
    }
}

public class multi_inheri{
    public static void main(String[] args) {
        animal a=new animal();
        a.eat();

         dog d =new dog();
         d.eat();
        d.bark();
        

        puppy p=new puppy();
        p.eat();
        p.bark();
        p.bhou();

}
}