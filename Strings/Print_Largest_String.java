/*
    Syntax..
           variable_1.compareTo(variable_2);
    
    1. It is taken ascii value .
    2. (i). compareTo Function return -value if <0.
       (ii). compareTo Function return +value if >0.
       (iii) compareTo Function return 0value if equal.
    
*/
public class Print_Largest_String{
    
    //This Function work on Find Largest String in Array.
    public static String Find_Largest(String str[]){
        String largest = str[0];
        
        for(int i=1; i<str.length; i++){
            if(largest.compareTo(str[i]) < 0){
                largest = str[i];
            }
        }
        
        return largest;
    }
    
    public static void main(String args[]){
        String fruits[] = {"apple", "mango", "banana"};
        
        //Invoked Method.
        System.out.println("Largest string is : "+Find_Largest(fruits));
    }
    
}