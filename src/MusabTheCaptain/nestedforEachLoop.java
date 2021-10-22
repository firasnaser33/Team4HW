package MusabTheCaptain;

public class nestedforEachLoop {
    public static void main(String[] args) {

        //logic of for each loop
//        for (dataType item : array){
//            System.out.println(item);
//        }

        //array an array or a collection
        //item each item of arra or collection is assigned to this variable
        //datatype data type of array or collection

        //create array elements

        int[] numbers = {1,9,0,5};

        //for each loop
        for (int number : numbers){
            System.out.println(number);
        }

        char [] letters = {'g','l','t','s','r','y'};

        //iterating an array by using for loop
        for (int i=0; i<letters.length; i++){
            System.out.println(letters[i]);
        }

        for (char item : letters){
            System.out.println(item);
        }

        //create two dimentional array
        int[][] twoDarray={{1,2,3},{4,5,6,7}};

        for (int [] onedArray : twoDarray){
            for (int i : onedArray){
                System.out.print(i + " ");
            }
        }



    }
}
