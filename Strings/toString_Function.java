/*
toString() function...
    
    Syntax.. 
         variable_name.toString();
    
    Note.
     1. toString Function work Only Object dataType.
     2. toString Function convert any object dataType value to String.
    
*/
public class toString_Function{

    public static void main(String args[]){
        Integer a = 12344;
        System.out.println("Integer value a : "+a);
        
        //Here, tostring() Function convert Integer to string.
        String str = a.toString();
        System.out.println("String value a : "+str);
        
    }
}