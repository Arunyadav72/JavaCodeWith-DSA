import java.util.ArrayList;
public class Swap_2_number_In_ArrayList{

    //!This Function work on swap two given index.
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        //swap statement.
        int tem = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, tem);
    }


    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        //store element.
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        //*Two given index
        int index1 = 1, index2 = 3;

        //print element before swaping..
        System.out.println("Non swap : "+list);

        //!Invoked swap Method.
        swap(list, index1, index2);

        //print element after swaping.
        System.out.println("swap : "+list);
        
    }
}