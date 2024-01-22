import java.util.*;
public class Linear_Search{
    
    //This is Linear search method...
    public static int Linear_search(int number[], int key){
        for(int i=0; i<number.length; i++){
            //searching key, ith time
            if(key == number[i]){
                return i; // if key found.
            }
        }
        
        return -1; //if key not found.
    }
    
    
    public static void main(String agrs[]){
        //Here declare array.
        int number[] = {2, 1, 5, 4, 8, 12, 11, 20, 18, 16, 30};
        int key = 11; //search element..
        
        //Invoked Method..
        int index = Linear_search(number, key);
        
        if(index == -1){
            System.out.println("Index not found");
        }
        else{
            System.out.println("Found index is : "+index);
        }
    }
}