import java.util.*;
public class How_to_calculate_String_Length{
    /*
        syntax = variable_name.length()
    */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //Declare String.
        String name;
        
        //Input.
        System.out.print("enter your full name : ");
        name = sc.nextLine();
        
        //output.
        System.out.println("Your name is : "+name);
        
        //calculate length.
        System.out.println("Length is : "+name.length());
    }
}