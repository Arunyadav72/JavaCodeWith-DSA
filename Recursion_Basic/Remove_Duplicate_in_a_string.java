public class Remove_Duplicate_in_a_string{
/*
*Logic::
    1. BASE CASE --> condition(i==str.length())
                        print Newstr;
                        return;
    2. KAAM
        char index = str.charAt(i);   // --> current index.
        1.  condition(map[index-'a'] == true)
                fun(str, i+1, Newstr, map); --> Recursive call.

        2.  else{ (map[index-'a'] == false)
                Newstr.appned(index);  //add statement.
                map[index-'a'] = true;
                fun(str, i+1, Newstr, map); --> Recursive call.
            }               

*1. It is taken O(n) time complexity.
*2. It is taken O(n) space complexity.

*/

    //This Function work on remove duplicate string.
    //*This is String Builder Type.
    public static void Remove_duplicate(String str, int i, StringBuilder Newstr, boolean map[]){
        //BASE CASE
        if(i==str.length()){
            System.out.println("New string is : "+Newstr);
            return;
        }

        //KAAM
        //*1. map[index-'a'] == true hai to not add.
        char index =str.charAt(i); //Cuurent character
        if(map[index-'a'] == true){ //----> check duplicate
            Remove_duplicate(str, i+1, Newstr, map); //----> Recursive call
        }
        //*2. map[index-'a']!= true.then the add.
        else{
            Newstr.append(index); // Add string statement.
            map[index-'a'] = true; 
            Remove_duplicate(str, i+1, Newstr, map); //----> Recursive call.
        }
    }

    public static void main(String args[]){
        String str1 = "appnnacollege";
        String str2 = "madam";

        //Print...
        System.out.println("Old string 1 is : "+str1);
        System.out.println("Old string 2 is :"+str2+"\n");

        //Invoked Method....
        Remove_duplicate(str1, 0, new StringBuilder(""), new boolean[26]);
        Remove_duplicate(str2, 0, new StringBuilder(""), new boolean[26]);

    }
}