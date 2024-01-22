/*
    Compression..
    -------------> 
                 Yadi kisi String me koi Latter bar-bar repeat kar raha hai.
    To Hame us  String ko chhota kar dena hai.
    Example....
      String                  Output Compression string
      aabbbcccc                   a2b3c4
      abcdddd                     abcd4
      abbcdd                      ab2cd2
      affggrr                     af2g2r2
    
*/

//---> to do. error

public class String_Compression{
    
    //This Function work on String Compression.
    public static String Compression(String str){
        StringBuilder sb = new StringBuilder("");
        
        for(int i=0; i<str.length(); i++){
            Integer counter = 1; // ith character kitani bar aaya hai.
            
            //Here, checking repeat character.
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                counter++;
                i++;
            }
            
            sb.append(str.charAt(i)); //Here, add  ith index character.
            
            if(counter > 1){
                sb.append(counter.toString()); //Here add counter
            }
        }
        
        return sb.toString();
    }
    
    public static void main(String args[]){
        String str1 = "aabbbcccc";
        String str2 = "abccdd";
        
        System.out.println("Before Compression :---> ");
        System.out.println("String str1 : "+str1);
        System.out.println("String str2 : "+str2);
        
        //Invoked Compression Method.
        System.out.println("\nAfter Compression :---> ");
        System.out.println("String str1 : "+Compression(str1));
        System.out.println("String str2 : "+Compression(str2));
    }
}