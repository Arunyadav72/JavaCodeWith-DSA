import java.util.ArrayList;

public class Get_element_Operation{
    public static void main(String args[]){
        ArrayList<Integer> value = new ArrayList<>();

        value.add(1);
        value.add(2);
        value.add(23);
        value.add(50);
        System.out.println(value);

        //Here, Perform get Operation Statement --> time is O(1).
        int element1 = value.get(2);
        int element2 = value.get(0);

        //Print Find index value.
        System.out.println("index 2 value is : "+element1);
        System.out.println("index 0 value is : "+element2);
    }
}