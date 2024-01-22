/*
    Question..
          For a given string converts each the first letter of each word to uppercase.
          Example.. 
           str = "hi, i am shradha khapara"
    
          output.. Hi, I Am Shradha Khapara
    
    1. It is taken O(n) time complexity.
    2. Here use Character.toUpperCase(variable_name);
       ......This Function variable name dataType only to only object type.
*/

//--> to do. error

import java.util.*;
public class Character_Uppercase_Function{
    
    //This Function work on Convert First Latter of string.
    public static String UpperCase_convert(String str){
        StringBuilder sb = new StringBuilder("");
        
        //It work on character 0 index uppercase(Capital). 
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch); //Here add character, here use . append() inbuilt Function. This is work on add two objectType string.
        
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.charAt(i)-1){
                sb.append(str.charAt(i));  //Here add space.
                i++;
                
                ch = Character.toUpperCase(str.charAt(i)); // Convert capital latter.
                sb.append(ch);
            }
            else{
                sb.append(str.charAt(i)); //Here add, if not space in string.
            }
        }
        
        return sb.toString(); //Here use toString inbuilt Function. This Function any dataType value convert to string.
    }
    
    public static void main(String args[]){
        String str = "hi, i am shradha khapara";
        
        System.out.println("Before Convert capital Latter :---> ");
        System.out.println("str : "+str);
        
        //Invoked Method.
        System.out.println("\nAfter Convert capital Latter :---> ");
        System.out.println("str : "+UpperCase_convert(str));
    }
}