import java.util.ArrayList;
public class Search_in_ArrayList{

    //!This Function work on search key in Sorted ArrayList.
    public static int Binary_search(ArrayList<Integer> list, int key){
        int s = 0, e = list.size()-1;
        
        while(s<=e){
            int mid = s+((e-s)/2);
            if(key == list.get(mid)){ //Key Found statement.
                return mid;
            }

            if(key > list.get(mid)){
                e--;
            }
            else{// (key < get(mid))
                s++;
            }
        }
        return -1; //key index not Found.
    }
    
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        //store element.
        list.add(23);
        list.add(20);
        list.add(15);
        list.add(12);
        list.add(10);
        list.add(5);

        int key = 12;//search key;

        //Here, Print key index
        int index = Binary_search(list, key); //!Invoked Binary Search Method.
        if(index != -1){
            System.out.println("Key index is : "+index);
        }
        else{
            System.out.println("Key is not exists");
        }
    }
}