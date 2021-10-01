package TRE.M;


import java.util.Arrays;

public class day01 {
    public static void main(String[] args) {

        System.out.println("hello would");
        int age=27;
        System.out.println(age);

        System.out.println("my names tre");


        // create a java logic that will count letter a or A from given string
        //example
        //JavA
        //output should be

        String sen="i love you kurdistan And USA";
        System.out.println(sen);
        String [] letters=sen.split(""); // splite from each letters
        System.out.println(Arrays.toString(letters));
        int countletterA=0;
        int countletterU=0;
        for (String eachletter : letters) {
            if (eachletter.equalsIgnoreCase("a")) {
                countletterA++;

            }
            if (eachletter.equalsIgnoreCase("U")){
                countletterU++;
            }
        }

        System.out.println(countletterA);
        System.out.println(countletterU);

    }
}
