package MusabTheCaptain;

public class StudyHallNestedForEachloop {

    public static void main(String[] args) {

//        for (dataType item : array){
//            System.out.println();
//        }

        //array = an array or a collection
        //item is each item of array collection is assigned to this variable we can call it whatever we want
        //dataType is the type of the array or collection

        //print array elements

        //create an array
        int[] numbers = {1,9,0,5};

        //for each loop
        for (int number : numbers){
            System.out.println(number + " ");
        }

        char[] letters = {'g', 'l', 't', 's', 'r', 'y'};

        //iterating through an array using a for loop
        for (int i = 0; i<letters.length; i++){
            System.out.println(letters[i]+ " ");
        }

        for (char item : letters){
            System.out.println(item);
        }
        //2d array
        int[][] twodarray = {{1,2,3,4},{5,6,7,8}};

        for (int[] oneararray : twodarray){//this will store each child container
            for (int wholelist : oneararray){ // this will store number from each container
                System.out.println(wholelist);
            }
            }








    }
}
