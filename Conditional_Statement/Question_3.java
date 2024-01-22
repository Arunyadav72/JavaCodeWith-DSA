/*
Question 3.......
             Write a java program to input week number (1-7) and print day of 
             week name using switch case.
*/

import java.util.*;
public class Question_3{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int week;
        
        System.out.print("enter the week name : (1-7) :: ");
        week = sc.nextInt();
        
        switch(week){
            case 1:
                System.out.println("Today is monday");
                break;
                
            case 2:
                System.out.println("Today is tuesday");
                break;
             
            case 3: 
                System.out.println("Today is wednesday");
                break;
               
            case 4:
                System.out.println("Today is thursday");
                break;
                
            case 5: 
                System.out.println("Today is friday");
                break;
                
            case 6:
                System.out.println("Today is satarday");
                break;
                
            case 7:
                System.out.println("Today is sunday");
                break;
                
            default:
                System.out.println("Wrong week number");
        }
    }
}