interface a {
    public void eat();
     
}

interface b extends a{
    public void bark();
} 

interface c extends a{
    public void meow();
}


public class HybridInheri implements b,c {
    public void eat(){
        System.out.println("eatting");
    }

    public void bark(){
        System.out.println("barking");
    }

    public void meow(){
        System.out.println("meowing");
    }
    public static void main(String[] args) {
        HybridInheri h= new HybridInheri();
        h.bark();
        h.eat();
        h.meow();
    }

    
}
