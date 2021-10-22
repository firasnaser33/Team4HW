package Firas.InterviewQuestionPractice;


//Create two char array to store different char array
//sort letters
//use if statements to compare
//use toString from char to string
//use loop to compare


import java.util.Arrays;

public class q2_sameLetter {

    public static void main(String[] args) {

//        String one = "A B C";
//        String two = "C B A D";
//
//        String[] splited = one.split(" ");
//        String[] splited2 = two.split(" ");
//        System.out.println(Arrays.toString(splited2));
//        System.out.println(Arrays.toString(splited));
//        Arrays.sort(splited);
//        Arrays.sort(splited2);
//        //System.out.println(Arrays.toString(splited2));
//
//        if (Arrays.equals(splited,splited2)){
//            System.out.println("contains same letters");
//        }else{
//            System.out.println("Are different ");
//          }
//

//        char a='z';
//        int bc=(int )a;
//        System.out.println(bc);



        System.out.println(letters("zbya","cab"));

    }

    public static boolean letters(String a, String b){
        char [] one=a.toCharArray();
        char [] two=b.toCharArray();


        Arrays.sort(one);
        System.out.println(Arrays.toString(one));
        Arrays.sort(two);

        String storage="";
        String storage2="";

        for (char each: one )
            storage+=each;


        for (char each: two)
            storage2+=each;


        return storage.equals(storage2);
    }



}

//    Write a return method that check if a string is build out of the same letters as another string.
//
//    Ex:  same("abc",  "cab"); -> true
//
//    same("abc",  "abb"); -> false:


