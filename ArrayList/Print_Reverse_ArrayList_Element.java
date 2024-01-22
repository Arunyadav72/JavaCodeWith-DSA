import java.util.ArrayList;
public class Print_Reverse_ArrayList_Element{
    public static void main(String args[]){
        ArrayList<Integer> rollno = new ArrayList<>();
        //store element..
        rollno.add(1);
        rollno.add(2);
        rollno.add(3);
        rollno.add(4);
        rollno.add(5);


        //* Here, Print Reverse order element.
        for(int i=rollno.size()-1; i>=0; i--){
            System.out.print(rollno.get(i)+" ");
        }
        System.out.println();
    }
}