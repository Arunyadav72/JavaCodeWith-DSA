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
public class Question_5_1{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year;
        
        System.out.print("enter the year : ");
        year = sc.nextInt();
        
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println(year +" is Leap year");
                }
                else{
                    System.out.println(year +" is not Leap year");
                }
            }
            else{
                System.out.println(year +" is not Leap year");
            }
        }
        else{
            System.out.println(year +" is not Leap year");
        }
    }
}
