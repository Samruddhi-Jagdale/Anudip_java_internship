public class SubParaDefau {
   
    void defaultsub(){
        int a=40;
        int b=30;
        int result = a-b;

        System.out.println("Subtraction :" + result);
    }

    void parasubtract(int a,int b){
        int result=a-b;
        System.out.println("Subtraction using Para method: " + result);

    }

    public static void main(String[] args) {
        SubParaDefau obj= new SubParaDefau();
        obj.defaultsub();
        obj.parasubtract(30,12 );
    }
}
