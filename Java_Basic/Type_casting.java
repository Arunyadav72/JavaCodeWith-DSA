public class Type_casting{
    public static void main(String args[]){
        float a = 12.50f;
        
        int b = (int)a; // This is Type casting statement.
        // Type casting is long value data type convert small data type value.
        // Type casting loss value from Long data type.
        
        // Variable 'a' store 12.50 value;
        // But type casting convert int data type.
        //so, loss value .50 
        
        System.out.println("Value = "+b);
       
        /*
        float c = 24.34f;
        int d = c;  // This is not type casting statement    */
        
        char ch = 'a';
        int number = (int)ch; //type casting
        System.out.println("a number is "+number);
    }
}
