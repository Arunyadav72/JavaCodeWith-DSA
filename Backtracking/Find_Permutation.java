public class Find_Permutation{
/*
*Question.
    find & print all permutations of a string.
    example ="abc"

*Solution.
!Permutation is called number of arrangement. I means, Main 1 element ko kitane tarike se arrange kar sakta hu.
!If given n element . Then the arrangement number is n!.
    str = "abc"
    arrangement = abc, acb
                  bac, bca
                  cab, cba

    *Note: Here, "abc" ke 6 arrangement ho sakate hai.      


*Stack Tree Analysis...
str = "abc

                     a b c
                     | | |
                     | | +---------------------------------------------------|
                     | +--------------------|                                |
                    /                        \                                \
                   /                          \                                \
                  /                            \                                \
                 /                              \                                \
                /                                \                                \
            {"a"} "b c"                      {"b"} "a c"                     {"c"}  "a b"
                   | |                              | |                              | |
                   | +-----|                        | +-----|                        | +-----|
                  /         \                      /         \                      /         \
                 /           \                    /           \                    /           \
                /             \                  /             \                  /             \
               /               \                /               \                /               \
        {"ab"} "c"        {"ac"} "b"     {"ba"} "c"        {"bc"} "a"     {"ca"} "b"       {"cb"}  "a"
                |                 |              |                 |              |                 |
               /                 /              /                 /              /                 /
              /                 /              /                 /              /                 /
          .  /                 /              /                 /              /                 /
Permuta-> {"abc"}           {"acb"}       {"bac"}           {"bca"}        {"cab"}           {"cba"}

Output of Permutation--> abc, "acb, bac, bca, cab, cba

*Logic:
    1. BASE CASE --> condition(str.length == 0) 
                        print ans;
                        return;

    2. KAAM..
        loop(i=0 to str.length)
            pick element --> char curr str.charAt(i);
            Newstr = str.substring(0, i) + str.substring(i+1);
            fun(Newstr, ans+curr); --> recursive call.                

*It is taken O(n*n!) time complexity.
*It is taken O(n) time complexity.
*/

    //This Funtion work on calculate Permutation..
    public static void Find_permutation(String str, String ans){
        //BASE CASE..
        if(str.length() == 0){
            System.out.println(ans); //Print ith element permutation.
            return;
        }

        //KAAM.
        for(int i=0; i<str.length(); i++){ //find ith element permutation.
            char curr = str.charAt(i); //pick ith element.
            //No add ith element, I means only add bacha hua element.
            String Newstr = str.substring(0, i) + str.substring(i+1);
            //add ith element with ans.
            Find_permutation(Newstr, ans+curr); //backtracking step.
        }
    }

    public static void main(String args[]){
        String str = "abc";

        //Invoked Method...
        System.out.println("Permutation is --> ");
        Find_permutation(str, "");
    }
}