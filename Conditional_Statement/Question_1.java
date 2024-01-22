/*
    Question...
        Write a java program to get a number from the user and print whether it is 
        positive or negative number.
*/

import java.util.*;
public class Question_1{

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int number;
        
        System.out.print("enter the number : ");
        number = sc.nextInt();
        
        //Check positive or negative number.
        if(number > 0){
            System.out.println(number +" is positive number");
        }
        else{
            System.out.println(number +" is negative number");
        }
    }
}
