/*
substring
    ----------> substring is continuous part of string. It is given start index, end index.
    Example..
         string str = "Helloworld";
    
         1. substring = hell
         2. substring = worl
         3. substring = llow
    
    Non substring
    --------------> Example = Hello world
                    substring = ewd
    Here, ewd is not substring because it is not continuous part of strings.
    
Substring..
    Example str = "Helloworld";
    
        start_index      endIndex           substring
         0                 4                  Hell
         6                 8                  or
         8                 10                 ld
         
*/
public class User_define_substring{
    
    //This Function work on calculate substring.
    public static String Print_substring(String str, int startIndex, int endIndex){
        String substr = new String("");
        
        for(int i=startIndex; i<endIndex; i++){
            substr+=str.charAt(i);
        }
        
        //Here return actual sub string.
        return substr;
    }
    
    
    public static void main(String args[]){
        String str = "Helloworld";
        
        //Invoked Method.
        System.out.println("substring is : "+Print_substring(str, 6, 8));
    }
}