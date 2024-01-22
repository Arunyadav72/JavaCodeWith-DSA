import java.util.*;
public class Smallest_number_in_Array{
    
    //This is Find Smallest number in Array method.
    public static int get_Smallest(int number[]){
        int smallest = Integer.MAX_VALUE; // It is taken plus infinity value, Maximum value..
        
        for(int i=0; i<number.length; i++){ //checking smallest number..
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        
        return smallest; // it is return actual smallest number.
    }
    public static void main(String args[]){
        int number[] = {2, 3, 5, 4, 8, 12, 11, 20, 18, 1, 16, 30};
        
        System.out.println("Smallest number is : "+get_Smallest(number));
    }
}