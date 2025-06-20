//polymorphism - we can use same function in any of class (eg.Potato can be used in any dish)
//to call function of parent in child give super word b4 function name
//polymorphism types-1.(overriding)runtime poly  2.(overloading) Compiled time poly


class notebook{
     void write(){
        System.out.println("write on me");
    }
}

class pen extends notebook{
    public void write(){
        System.out.println("write by pen");
    }
}

class pencil extends notebook{
    public void write(){
        super.write(); //calls the method in animal class
        System.out.println("Write by pencil");
    }
}

public class polymorphism{
    public static void main(String[] args){
        notebook a= new notebook();
        a.write();
        pen d=new pen();
        d.write();
        pencil c=new pencil();
        c.write();
    }
}
