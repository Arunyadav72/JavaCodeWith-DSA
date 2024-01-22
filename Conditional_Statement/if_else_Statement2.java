import java.util.*;
public class if_else_Statement2{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int age;
        
        System.out.print("enter the age : ");
        age  = sc.nextInt();
        
        if(age>=18){
            System.out.println("Adult");
        }
        
        if(age>=13 && age<18){
            System.out.println("teenager");
        }
        else{
            System.out.println("not adult");
        }
    }
}