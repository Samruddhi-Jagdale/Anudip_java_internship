// public class addusingpara {
//     int a;
//     int b;
//     public addusingpara(int num1,int num2){
//         a=num1;
//         b=num2;

//     }
//     void add(){
//         int sum=a+b;
//         System.out.println("Sum:" + sum);
//     }
//     public static void main(String[] args) {
//         addusingpara obj = new addusingpara(14, 23);
//         obj.add();
//     }
// }


public class addusingpara{

    void add(int a,int b){
        int sum=a+b;
        System.out.println("Addition is : " + sum);
    }

    public static void main(String[] args) {
        addusingpara obj =new addusingpara();
        obj.add(10,20);
    }

}