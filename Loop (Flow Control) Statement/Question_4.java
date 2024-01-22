/*
Question..
Write a program to print the multipalication table N, entered by the user.

*/

import java.util.*;
public class Question_4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("enter the table number : ");
        n = sc.nextInt();
        
        int i=1;
        while(i<=10){
            int table = n*i;
            System.out.println(n+"*"+i+" = "+table);
            i++;
        }
    }
}