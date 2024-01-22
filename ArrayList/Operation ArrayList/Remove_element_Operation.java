import java.util.ArrayList;

public class Remove_element_Operation{
    public static void main(String args[]){
        ArrayList<Integer> rollno = new ArrayList<>();

        rollno.add(1);
        rollno.add(2);
        rollno.add(23);
        rollno.add(50);

        System.out.println(rollno); //--> Before Delete value..

        //Here, Perform Remove Operation Statement. Time is --> O(n).
        rollno.remove(0);
        rollno.remove(2);

        System.out.println(rollno);//--> After Delete value.
    }
}