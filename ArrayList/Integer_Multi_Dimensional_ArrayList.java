/*
*Multi Dimensional ArrayList...
    1. ArrayList ki ak aisi list jisake andar ak aur ArrayList ho.
    2. Here, Tum small list ke andar kam ya jayda element store kar sakte ho.
    
    *Structure...
        mainList--> ------------------------
                    |list1 = 1, 2, 3, 4    |
                    |list2 = 2, 4, 6       |
                    |list3 = 3, 6, 9, 12   |
                    |list4 = 4, 8, 12, 16  |
                    ------------------------

    *Syntax..
       ArrayList< ArrayList< data_Type>> variable_name = new ArrayList<>();
 */

import java.util.ArrayList;
public class Integer_Multi_Dimensional_ArrayList{
    public static void main(String args[]){
        //!declare  Multi dimensional ArrayList.
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        //2 small ArrayList.
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        //store element in small ArrayList.
        list1.add(1); //list 1
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add(4); //list 2
        list2.add(3);
        list2.add(2);
        list2.add(1);

        //*Now, store small list element in mainList.(store Multi Dimensinal ArrayList)
        mainList.add(list1);
        mainList.add(list2);

        //!Print element without Nested loop.
        System.out.println("\nwithout nested loop : "+mainList);

        //!Print element use Nested loop
        System.out.println("use nested loop : ");
        for(int i=0; i<mainList.size(); i++){
            //This statement return number of list store in mainList(Multi dimensional).
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}