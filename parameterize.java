class Student{
    String name;
    int age;

    Student(String studName,int studAge){
        name=studName;
        age=studAge;
    }
    void display(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
    public static void main(String[] args){
        Student s1=new Student("Amit" ,20);
        Student s2= new Student("Neha" ,23);
        Student s3= new Student("Abhi" ,18);

        s1.display();
        System.out.println("----");
        s2.display();
        System.out.println("----");
        s3.display();
    }

}

public class parameterize {
    
}
