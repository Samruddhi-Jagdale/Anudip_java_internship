

public class classobj {

    public void greet(){
        System.out.println("Hello,this is method in classobj");
    }
    public void display(){
        System.out.println("This is show method in classobj");
    }
    public static void main(String[] args) {
        classobj obj =new classobj(); //constructor=special method or function
        obj.greet();
        obj.display();
    }
}