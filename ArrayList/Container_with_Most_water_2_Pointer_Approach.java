/*
*Container woth Most water
   For given n lines on x-axis, use 2 line to from a container such that it holds
   maximum water.
   Height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
*/
//! It is taken O(n) time complexity.
import java.util.ArrayList;

public class Container_with_Most_water_2_Pointer_Approach{

    //!This Function work on find maximum water on container. (Optimized Approach)
    public static int store_water(ArrayList<Integer> Height){
        int maximum_water = 0;
        int Lp = 0; //Its Left pointer.
        int rp = Height.size()-1; //Its right pointer.

        while(Lp < rp){
            //Here, Find Minimum height(Lp, rp index) of line on x-axis.
            int height = Math.min(Height.get(Lp), Height.get(rp));

            //Here, Find width of Lp and rp ke mid ka distance
            int width = rp-Lp;

            //Find current water of Lp and rp container
            int curr_water = height*width;

            //Find Maximum water.
            maximum_water = Math.max(maximum_water, curr_water);


            //update value if Lp and rp Height minimum.
            if(Height.get(Lp) < Height.get(rp)){//*Lp minimum.
                Lp++;
            }
            else{//*rp minimum.
                rp--;
            }
        }
        return maximum_water;
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
        System.out.println("Maximum water value is : "+store_water(Height));

    }
}