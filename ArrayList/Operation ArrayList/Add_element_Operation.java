import java.util.ArrayList;

public class Add_element_Operation{
    public static void main(String args[]){
        //Integer ArrayList.
        ArrayList<Integer> value = new ArrayList<>();

        //Here perform add Operation statement -- > time is O(1).
        value.add(1);
        value.add(2);
        value.add(23);
        value.add(50);

        //Here Print ArrayList element Statement.
        System.out.println(value);

        //String ArrayList.
        ArrayList<String> Name = new ArrayList<>();

        //Here perform add Operation statement -- > time is O(1).
        Name.add("Arun yadav");
        Name.add("Saurabh yadav");

        //Print Statement.
        System.out.println(Name);
    }
}