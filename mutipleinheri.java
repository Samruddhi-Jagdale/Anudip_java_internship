interface one{
    public void eat();  //abstract method no body
}

interface two{
    public void bark();   //abstract method no body
}

interface three extends one, two{
    public void meow(); //abstract method no body
}

class childclass implements one ,two{
    public void eat() {
        System.out.println("Childclass is eating");
        
    }

    public void bark(){
        System.out.println("childclass is barking");
    }

    public static void main(String[] args) {
        childclass c = new childclass();
        c.eat();
        c.bark();
    }
}