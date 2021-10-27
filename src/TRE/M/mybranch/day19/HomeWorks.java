package TRE.M.mybranch.day19;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {


        System.out.println("************** Q number1 **********");

        int numbers [] ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println(numbers[10]);
        numbers[5]=35;
        System.out.println(numbers[5]);
        numbers[9]= numbers[6]+numbers[13];
        System.out.println(numbers[9]);


        //a) Write a statement that declares a string array initialized with the following strings:
//"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
//b) Write a loop that displays the contents of each element in the array that you declared.

        System.out.println("*************************Q number2**************");

        String names [] ={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday"};
//                           0         1         2           3           4          5          6

        for (int i=0 ; i <= names.length-1; i++){
            System.out.print(names[i]+ " ");
        }
        System.out.println();

//Write a program that creates an array of 10 elements size.
// Your program should prompt the user to input numbers in array and then display the sum of all array elements.
        System.out.println("************************Q number 3******************");

        Scanner input= new Scanner( System.in);


        int[] t = new int[10];
        int sum = 0;
        System.out.println(" please enter your numbers");
        for (int i = 0; i < t.length-1; i++) {
            t[i]=input.nextInt();
            sum=sum+t[i];

        }
        System.out.println(Arrays.toString(t));
        System.out.println("Total of all numbers is " + sum);

        System.out.println("***************************Q number4**********************");


//create a java program that will check days string and depends on number you passed
//you should be able to see day name
//example : 2 tue
//3 :wed
//numbers should be between 1 to 7 (included)
//if numbers are not between 1 to 7 print invalid number
//and give user 3 attempt if it is still not between 1 to 7 then stop whole system

        String [] days={"mon","tue","wed","thur","fri","sat","sun"};
        //                0     1    2      3      4     5     6

        System.out.println("enter your number : ");
        int number= input.nextInt();

        int attemp=1;
        while(number>7 || number<1){
            System.out.println("invalid number");
            System.out.println("try again !!");
        }
        number= input.nextInt();
        attemp++;
        if (attemp==3 && (number>7 || number<1)) {
            System.out.println("user try 3 time");
            System.out.println("system locked");

        } String result= days[number-1];
        System.out.println(result);


        System.out.println("********************************************************");

        int [] numberList={2,3,10,-55,209,100,7,9,10,100};
        System.out.println(Arrays.toString(numberList));//{2,3,10,-55,209,100,7,9,10,100};

        Arrays.sort(numberList);

        System.out.println(Arrays.toString(numberList));//[-55, 2, 3, 7, 9, 10, 10, 100, 100, 209]
        //[-55, 2, 3, 7, 9, 10, 10, 100, 100 ]

        //print the min number
        //after sorting your min number will be always your first number from array
        System.out.println("Min Number is "+ numberList[0]);

        //max number from list
        //will be last index since we sorted
        //whihc is lenght -1
        System.out.println("Max Number is "+ numberList[numberList.length-1]);

        //medium number
        //first you will need to check if number can be divided by 2
        System.out.println("Medium number is " + numberList [numberList.length /2 ]);

    }
}
