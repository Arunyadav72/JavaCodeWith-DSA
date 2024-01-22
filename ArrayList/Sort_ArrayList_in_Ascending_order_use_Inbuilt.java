import java.util.ArrayList;
import java.util.Collections;
/*
!Sort Mathod...
    1. Here, I am use Collections.sort() Method.
    2. This method sort ArrayList element in ascending order.

    *Syntax..
            Collection.sort(variable_name);
 */

public class Sort_ArrayList_in_Ascending_order_use_Inbuilt{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        //store element.
        list.add(23);
        list.add(15);
        list.add(10);
        list.add(30);
        list.add(5);

        //Print element before sorting.
        System.out.println("Unsorted : "+list);

        //!Here, sort ArrayList use Inbuilt Method. (Increasing order)
        Collections.sort(list); //This inbuilt method sort ArrayList element.

        //print element after sorting.
        System.out.println("Sorted : "+list); 
    }
}