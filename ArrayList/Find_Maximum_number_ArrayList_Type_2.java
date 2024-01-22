import java.util.ArrayList;
public class Find_Maximum_number_ArrayList_Type_2{

    //!This Method work on check maximum number in ArrayList.
    //use Inbuilt Method..
    public static int Find_max(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE; //It is represent Min value.
        
        for(int i=0; i<list.size(); i++){
            //Here, use inbuilt max Method.
            max = Math.max(max, list.get(i));
        }

        return max;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        //store element.
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        //Invoked Method.
        System.out.println("Maximum number is : "+Find_max(list));
    }
}