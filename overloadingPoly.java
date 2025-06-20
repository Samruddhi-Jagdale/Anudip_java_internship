//overloading --> passing para in function same as overriding

class greet {
    public void welcome(String name){
        System.out.println("Welcome " + name);
    }

    public void thanku(String name){
        System.out.println("Thanku " + name);
    }
}
public class overloadingPoly{
    public static void main(String[] args) {
        greet g= new greet();
        g.welcome("Samruddhi");
        g.thanku("Diksha");
        }
}


