import java.util.ArrayList;
import java.util.Collections;
/*
!Sort Method..
    1. Here, I am use Collection.sort() and Collections.reverseOrder() Method.
    2. This method sort ArrayList element in Decending order.
    
    *Syntax..
          Collections.sort(variable_name, Collections.reverseOrder());

 */

public class Sort_ArrayList_in_Decending_order_use_Inbuilt{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        //store element.
        list.add(23);
        list.add(15);
        list.add(10);
        list.add(30);
        list.add(5);

        //print element before sorting.
        System.out.println("Unsorted : "+list);

        //!Here, sort ArrayList use Inbuilt Method. (Decreasing order)
        Collections.sort(list, Collections.reverseOrder()); //This inbuilt method sort ArrayList element.

        //print element after sorting.
        System.out.println("Sorted : "+list);

    }
}