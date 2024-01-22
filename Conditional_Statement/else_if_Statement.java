import java.util.*;
public class else_if_Statement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age;
        
        System.out.print("enter the age : ");
        age = sc.nextInt();
        
        //This is else if statement....
        if(age>=18){
            System.out.println("You are adult");
        }
        else if(age>=13 && age<18){
            System.out.println("You are teenager");
        }
        else{
            System.out.println("You are child");
        }
    }
}
