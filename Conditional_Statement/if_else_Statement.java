import java.util.*;
public class if_else_Statement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age;
        
        System.out.print("enter the age : ");
        age = sc.nextInt();
        
        //This is if-else statement.
        if(age>=18){
            System.out.println("adult : drive, vote");
        }
        else{
            System.out.println("not adult");
        }
    }
}
