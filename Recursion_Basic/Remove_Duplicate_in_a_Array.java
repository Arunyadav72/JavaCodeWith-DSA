public class Remove_Duplicate_in_a_Array{
//* Here Use char Array. 
    //This Finction Work on Remove Duplicate character.
    public static String Remove_duplicate(String str, int i, String Newstr, boolean map[]){
        //BASE CASE...
        if(i == str.length()){
            //System.out.println(Newstr);
            return Newstr;
        }

        //KAAM
        char index = str.charAt(i);
        if(map[index - 'a'] == true){
            return Remove_duplicate(str, i+1, Newstr, map);
        }
        else{
            map[index - 'a'] = true;
            return Remove_duplicate(str, i+1, Newstr+index, map);
        }
    }

    public static void main(String args[]){
        char str[] = {'a', 'p', 'p', 'n', 'n', 'a', 'c', 'o', 'l', 'l', 'e', 'g', 'e'};
        System.out.println("New string  = "+Remove_duplicate(new String(str), 0, "", new boolean[26]));
    }
}