package TRE.M.mybranch.day19;

public class methods {

    public static void main(String[] args) {


        welcome();
        multiply(5,10);
        divide(100,10);
        plus(50,10);
        minus(30 , 15);
        stars();



    }





    public static void welcome(){
        System.out.println("welcome to our calculators");
    }

    public static  void  multiply(int a , int b) {
        System.out.println(a*b);
    }

    public static void divide(int a , int b){
        System.out.println(a/b);

    }
    public static void plus( int a , int b){
        System.out.println(a+b);
    }

    public static void minus(int a , int b){
        System.out.println(a-b);
    }
    public  static void stars(){
        System.out.println("***************************************************");
    }
    }
