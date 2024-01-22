/*
    Example -->
        1. income < 5L = 0% tax
        2. income between 5-10L = 20% tax
        3. income > 10L = 30% tax
*/
import java.util.*;
public class Income_Tax_calculater{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income;
        int tax;
        
        System.out.print("enter your income salary : ");
        income = sc.nextInt();
        
        //Check income tax;
        if(income < 500000){
            tax = 0;
        }
        else if(income >= 500000 && income < 1000000){
            tax = (int)(income*0.2);
        }
        else{
            tax = (int)(income*0.3);
        }
        
        System.out.println("Your income tax is : "+tax);
    }
}
