import java.util.ArrayList;

public class contains_element_Operation{
    public static void main(String args[]){
        ArrayList<Integer> rollno = new ArrayList<>();

        rollno.add(1);
        rollno.add(2);
        rollno.add(23);
        rollno.add(50);
        System.out.println(rollno);

        //Here Perform contains element Operation. Time is : O(n).
        System.out.println("23 is exists = "+rollno.contains(23));
        System.out.println("10 is exists = "+rollno.contains(10));
    }
}