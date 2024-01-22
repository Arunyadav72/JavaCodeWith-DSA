import java.util.ArrayList;
public class Find_size_of_ArrayList_Iterative_Type{
    public static void main(String args[]){
        ArrayList<Integer> rollno = new ArrayList<>();

        //store element..
        rollno.add(1);
        rollno.add(2);
        rollno.add(23);
        rollno.add(50);

        //Here, print ArrayList element from Iterative Type.
        for(int i=0; i<rollno.size(); i++){
            System.out.print(rollno.get(i)+" ");
        }
        System.out.println();
    }
}