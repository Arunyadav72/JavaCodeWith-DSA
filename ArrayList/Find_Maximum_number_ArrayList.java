import java.util.ArrayList;
public class Find_Maximum_number_ArrayList{

    //!This Method check max number in ArrayLsit.
    //without inbuilt method..
    public static int Find_max(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE; //It is -infinity value.

        for(int i=0; i<list.size(); i++){
            if(max < list.get(i)){//check maximum number.
                max = list.get(i);//assign maximum number.
            }
        }

        return max;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        //store element..
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        //!Invoked Method.
        System.out.println("Maximum number is : "+Find_max(list));
    }
}