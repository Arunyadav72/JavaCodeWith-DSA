public class check_String_is_Palindrome{
    /*
    * If farword and backword read are equal. It called Palindrome.
    * It is taken O(n) time compexity.
    * noon        noon
      ^^^^        ^^^^
      ||||________||||
      |||__________|||
      ||____________||
      |______________|
    
    */
    
    //This Method checking Palindrome  string.
    public static boolean Is_palindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            //checking palindrome.
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false; //if not equals, not Palindrome.
            }
        }
        
        return true; // return palindrome.
    }
    
    public static void main(String args[]){
        String str1 = "noon";
        String str2 = "madam";
        String str3 = "mango";
        
        //Here Invoked Is_palindrome Method.
        System.out.println(str1+" is palindrome = "+Is_palindrome(str1));
        System.out.println(str2+" is Palindrome = "+Is_palindrome(str2));
        System.out.println(str3+" is Palindrome = "+Is_palindrome(str3));
        
    }
}