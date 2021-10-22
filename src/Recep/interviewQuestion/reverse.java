package Recep.interviewQuestion;

public class reverse {

    // (String) Reverse
//    Write a return method that can reverse  String
//
//    Ex: Reverse("ABCDE"); ==> EDCBA

    //make a string to reverse
    // make empty string to store what you want to reverse
    //find length of string
    //make loop with staring point as last index
    //ending point should be the first index which is 0
    //and we decrement
    //reassign empty string to charAt(loop variable)
    // print outside block
    // or you can print inside block to see all steps



    public static void main(String[] args) {

//        String str="FIRAS";
//
        //   String reverse="";
//
//        for (int i=str.length()-1; i>=0; i-- ){
//            reverse+=str.charAt(i);
//
//        }
//
//        System.out.println(reverse);


        System.out.println(reverseString("Recep"));

        System.out.println(reverse("MUSAB"));


    }

    public static String reverseString(String str){


        String reverse="";

        for (int i=str.length()-1; i>=0; i-- ){
            reverse+=str.charAt(i);

        }
        return reverse;
    }

    public static String reverse(String name){

        return new StringBuffer(name).reverse().toString();
    }

}
