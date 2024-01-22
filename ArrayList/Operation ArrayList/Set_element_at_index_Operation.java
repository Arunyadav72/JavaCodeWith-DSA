import java.util.ArrayList;

public class Set_element_at_index_Operation{
    public static void main(String arsg[]){
        ArrayList<Integer> rollno = new ArrayList<>();

        rollno.add(1);
        rollno.add(2);
        rollno.add(23);
        rollno.add(50);

        System.out.println(rollno);//Here, Print Before update value.

        //Here, Perform Set(Update) element at index Operation Statement --> Time is : O(n)
        rollno.set(2, 3);

        System.out.println(rollno);//Here, Print After update value.
    }
}