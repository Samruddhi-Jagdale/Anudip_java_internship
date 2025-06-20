//Class is blueprint of the object.
//Like when we have to built any bulding or house first we take 
//its plan or small sized picture or diagram of it.-->Class
//Object is main real house we build.
//methods are nothing but functions
//2types-->Default,Parameterized

public class class_obj{
    //default method
    void greet(){
        System.out.println("Hello Samruddhi.");
    }

    //Parameterized method
    void say(String name){
        System.out.println("Hello " + name + " Good morning!");
    }

    public static void main(String[] args) {
        
        class_obj obj =new class_obj();
        obj.greet();
        obj.say("Samruddhi");
    }
}

