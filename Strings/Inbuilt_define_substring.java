/*
    Here,
    Inbuilt substring..
    
    1. syntax..
         variable_name.substring(startIndex, endIndex);
    
    2.substring
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
    
*/
public class Inbuilt_define_substring{
    
    public static void main(String args[]){
        String str = "Helloworld";
        
        //Inbuilt define substring...
        
        System.out.println("substring is : "+str.substring(6, 8));
    }
}