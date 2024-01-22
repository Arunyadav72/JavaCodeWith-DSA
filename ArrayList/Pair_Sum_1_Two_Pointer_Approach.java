/*
*Pair Sum 1
    Find if any pair in a sorted ArrayList has a target Sum.
    list = [1, 2, 3, 4, 5, 6], target = 5
*/
//! It is taken O(n) time complexity.
import java.util.ArrayList;

public class Pair_Sum_1_Two_Pointer_Approach{
    //!This Function work on check pair sum equal to target.
    public static boolean Check_pair_sum(ArrayList<Integer> list, int target){
        int Lp = 0;//Its Left pointer.
        int rp = list.size()-1; //Its right pointer.
    
        while(Lp < rp){
            int sum = list.get(Lp)+list.get(rp);//sum of Lp and rp value.
    
            //target is Found statement.
            if(sum == target){
                return true;
            }
    
            //if sum of value less than target.
            if(sum < target){
                Lp++; //*Here, increasing Left pointer
            }
            else{//sum of value greater than target.
                rp--; //*Here, decreasing right pointer.
            }
        }
        return false; //target is not Found statement.
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        //!Invoked Method..
        if(Check_pair_sum(list, target)){//true statement.
            System.out.println("Target pair sum is exists");
        }
        else{
            System.out.println("Target pair sum is not exists");
        }
    }
}