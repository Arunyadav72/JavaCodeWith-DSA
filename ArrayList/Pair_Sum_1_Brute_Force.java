/*
*Pair Sum 1
    Find if any pair in a sorted ArrayList has a target Sum.
    list = [1, 2, 3, 4, 5, 6], target = 5
*/
//! It is taken O(n^2) time complexity.
import java.util.ArrayList;

public class Pair_Sum_1_Brute_Force{

    //!This Function work on check Pair Sum equal to target.
    public static boolean Check_pair_sum(ArrayList<Integer> list, int target){
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                //*check pair sum is equal to target.
                int sum = list.get(i)+list.get(j); //sum of ith and jth index.
                if(sum == target){
                    return true;//Target pair sum is exists.
                }
            }
        }
        return false;//Target pair sum is not exists.
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        //*store element -> sorted order
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;//*pair sum target.

        //!Invoked Method.
        if(Check_pair_sum(list, target)){//True statement.
            System.out.println("Target Pair sum is exists: true");
        }
        else{
            System.out.println("Target Pair sum is not exists : false");
        }
    }
}