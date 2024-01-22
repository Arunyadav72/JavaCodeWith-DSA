/*
*This Method calculate ArrayList of length.
!Syntax...
    ArrayList_variable_name.size();


*/
import java.util.*;
public class Find_size_of_ArrayList{
    public static void main(String args[]){
        ArrayList<Integer> rollno = new ArrayList<>();

        //store ArrayList element..
        rollno.add(1);
        rollno.add(2);
        rollno.add(23);
        rollno.add(50);


        //!Calculate ArrayList size statement.
        System.out.println("ArrayList size is : "+rollno.size());
    }
}