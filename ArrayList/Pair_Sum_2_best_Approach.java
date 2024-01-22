/*
*Pair Sum 2
   Find if any pair in a Sorted & Rotated ArrayList has a target Sum.
   list = [11, 15, 6, 8, 9, 10], target = 16
*/
//! It is taken O(n) time complexity (but best time).
import java.util.ArrayList;

public class Pair_Sum_2_best_Approach{
    //!This Function work on check on Pair sum equal to target.
    public static boolean Check_pair_sum2(ArrayList<Integer> list, int target){
        //*find breaking point(pivot) statement.
        int bp = -1;
        int n = list.size();
        for(int i=0; i<n; i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }

        //Now checking..
        int Lp = bp+1; // Left pointer(Smallest).
        int rp = bp; // right pointer(Largest).
        while(Lp != rp){
            int sum = list.get(Lp)+list.get(rp); //sum of Lp and rp value.

            if(sum == target){//*Target is Found statement.
                return true;
            }

            //If sum is largest than target then rp--
            if(sum > target){
                rp = (n+rp-1)%n;
            }
            else{//If sum is smallest than target then Lp++
                Lp = (Lp+1)%n;
            }
        }
        return false; //*Target is not Found statement.
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        //store value -- Its rotated order.
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16; //*Pair target.

        if(Check_pair_sum2(list, target)){//true statement.
            System.out.println("Target pair sum is exists");
        }
        else{
            System.out.println("Target pair sum is not exists");
        }
    }
}