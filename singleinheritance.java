//inheritance -->allows child class to acquire properties of parent class
//types -1.single 2.mutilevel 4.heirarchy 5.hybrid 
//3.multiple(java doesnt support thats why it use interface) 
//single 1C:1P
//extends word b4 word child class and after word parent class
//we dont use main class over every class
//child can use parent's property but parent doesnt thats why 
//when we call funct we dont give class as parents 
    


     class nature{
        void give(){
        System.out.println("Nature always gives us");
     }
    }

    class human extends nature{
        void take(){
            System.out.println("Human always takes from nature");
        }
    }

    
public class singleinheritance {
    public static void main(String[] args) {
        human c= new human();  //child can use parents property
        c.give();
        c.take();

        nature n= new nature();  //parent cant use child's property
        n.give();
       // n.take();  //this will dont give output 
    }
    
}
