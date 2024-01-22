/*
*Container woth Most water
   For given n lines on x-axis, use 2 line to from a container such that it holds
   maximum water.
   Height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
*/
//! It is taken O(n^2) time complexity.
import java.util.ArrayList;

public class Container_with_Most_water_Brute_Force{

    //!This Function work on find maximum water store on container. (Brute Force)
    public static int store_water(ArrayList<Integer> list){
        int maximum = 0;
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                //find Hieght --> choose pair ith and jth ki smallest height.
                int height = Math.min(list.get(i), list.get(j));
                //find width --> choose pair ith and jth index ke mid ka distance.
                int width = j-i;

                //Find current water --> ith and jth container ke mid ka water.
                int curr_water = Math.max(maximum, height*width); 

                //Find Most water container.
                maximum = Math.max(maximum, curr_water);
            }
        }

        return maximum;
    }


    public static void main(String args[]){
        ArrayList<Integer> Height = new ArrayList<>();
        //*Here, store n line of height on x-axis.
        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);

        //!Invoked Method.
        System.out.println("Most water container value is : "+store_water(Height));
    }
}