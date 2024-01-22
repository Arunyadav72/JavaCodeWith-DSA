import java.util.*;
public class Largest_number_in_Array{
    
    //This is Find Largest number in array method..
    public static int get_Largest(int number[]){
        int largest = Integer.MIN_VALUE; // It is taken mins infinity, value, minimnum value..
        
        for(int i=0; i<number.length; i++){
            if(largest < number[i]){ // checking largest number..
                largest = number[i];
            }
        }
        
        return largest; // return actual largest number..
    }
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int number[] = {2, 1, 5, 4, 8, 12, 11, 20, 18, 16, 30};
        
        System.out.println("Largest value is : "+get_Largest(number));
    }
}