import java.util.ArrayList;
public class Swap_All_element_ArrayList{

    //! This Function work on swap All ArrayList element.
    public static void swap_All(ArrayList<Integer> list){
        int i=0;
        while(i<(list.size()/2)){
            //swap statement.
            int tem = list.get(i);
            list.set(i, list.get(list.size()-i-1));
            list.set(list.size()-i-1, tem);

            i++;
        }
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        //store element.
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        //print element before swaping.
        System.out.println("non swap : "+list);

        //!Invoked Method.
        swap_All(list);

        //print element after swaping.
        System.out.println("swap : "+list);
    }
}