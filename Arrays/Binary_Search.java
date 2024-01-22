import java.util.*;
public class Binary_Search{
    /*
    Binary search operation only perform increasing and decreasing order element.
    */
    
    //This is binary search method..
    public static int Binary_search(int number[], int key){
        int start = 0;
        int end = number.length-1;
        
        while(start <= end){
            int mid = (start+end)/2;
            
            if(key == number[mid]){
                return mid;  // if key found.
            }
            
            if(key < number[mid]){ // go to left part array of mid.
                end = mid-1;
            }
            else{ // key > number[mid] --> go to right part array of mid.
                start = mid+1;
            }
        }
        
        return -1; //if key not found.
    }
    
    public static void main(String args[]){
        int number[] = {2, 4, 6, 8, 10, 12, 14, 15, 16, 17, 20};
        int key = 10; //search element.
        
        //Invoked binary_search method..
        System.out.println("Index for key is : "+Binary_search(number, key));
    }
}