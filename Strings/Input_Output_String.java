/*
sc.next() --> It is input one words. but it is not input space line.
sc.nextLine() --> It is input all words. but it is input space line. 
*/
import java.util.*;
public class Input_Output_String{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //Declate String.
        String name1;
        String name2;
        
        //Input name1, using nextLine() Function.
        name1 = sc.nextLine();
        
        //Input name2, using next() Function.
        name2 = sc.next();
        
        //Output String.
        System.out.println("Name1 = "+name1);
        System.out.println("Name2 = "+name2);
    }
}