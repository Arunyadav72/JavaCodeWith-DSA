public class Find_subset{
/*
*Question:
    Find & print all subset of given string.
    example: "abc"

*Solution:
    str = "abc"
    subset = {}, {a}{b}{c}{ab}{bc}{ac}{abc}
    *Note: Here, total 8 subset.
    if string length n. Then the subset = 2^n

*Stack Tree Analysis:
str = "abc" 

                                    abc
                                    |
                               Yes./ \No.
                                  /   \
                                 /     \
                                /       \
                          {"a"}  "bc"  {} "bc"
                                  |        |
                             Yes./ \No.    ----------------------------|
                                /   \                             Yes./ \No.
                               /     \                               /   \
                              /       \                             /     \
                        {"ab"} "c" {"a"} "c"                  {"b"} "c"  {} "c"
                                |         |                          |       |
                           Yes./ \No.     --------|             Yes./ \No.   -----------|
                              /   \          Yes./ \No.            /   \           Yes./ \No.
                             /     \            /   \             /     \             /   \
                            /       \          /     \           /       \           /     \
Subset ---->          {"abc"}    {"ab"}    {"ac"}    {"a"}    {"bc"}    {"b"}     {"c"}    {} 

Output of subset = {"abc"}, {"ab"}, {"ac"}, {"a"}, {"bc"}, {"b"}, {"c"}, {}

*Logic:
    1. BASE CASE --> condition(i==str.length())
                     print(ans)
                     return
    2. KAAM
       YES choice.. fun(str, i+1, ans+str.charAt(i));
       No choice..  fun(str, i+1, ans);                

* It is taken O(n*2^n) time complexity.
* It is taken O(n) space complexity.
* It is find string  subset.       
*/    

    //This Function work calculate String subset..
    public static void Find_Subset(String str, int i, String ans){
        //BASE CASE
        if(i == str.length()){
            if(ans.length() == 0){ //If subset is empty.
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        //KAAM. Recursive call..
        //*1. Yes choice. If choice yes then the add element.
        Find_Subset(str, i+1, ans+str.charAt(i));  

        //* No Choice. If choice No then the not add element.
        Find_Subset(str, i+1, ans); //Backtracking step.
    }

    public static void main(String args[]){
        String str = "abc";
        
        //Invoked Method...
        System.out.println("Subset is ---> ");
        Find_Subset(str, 0, "");
    }
}