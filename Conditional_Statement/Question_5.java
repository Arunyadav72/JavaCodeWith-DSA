/*
    Write a java program that takes a year from the user and 
    print whether that year is a leap or not.
    Condition......
    
    (is year divisible by 4) ---> yes (is year divisible by 100) ---> yes (is year divisible by 400) ----> print leap year.
          |                                |                                   |
          |                                |                                   |
          No                               No                                  No
    
     Not leap year                    Not leap year                       Not leap year

*/

import java.util.*;
public class Question_5{

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int year;
        
        System.out.println("enter the year : ");
        year = sc.nextInt();
        
        boolean x = (year % 4 == 0);
        boolean y = (year % 100 == 0);
        boolean z = (year % 400 == 0);
        
        if(x && y && z){
            System.out.println(year +" is Leap year");
        }
        else{
            System.out.println(year +" is not Leap year");
        }
    }
}