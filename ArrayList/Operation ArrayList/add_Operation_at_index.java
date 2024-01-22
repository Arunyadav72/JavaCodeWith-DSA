import java.util.ArrayList;

public class add_Operation_at_index{
    public static void main(String args[]){
        ArrayList<Integer> rollno = new ArrayList<>();

        rollno.add(1);
        rollno.add(2);
        rollno.add(23);
        rollno.add(50);
        System.out.println(rollno);

        //Here, Perform --> add(index, value) -- Operation. Time is : O(n).
        rollno.add(3, 10);

        System.out.println(rollno);
    }
}