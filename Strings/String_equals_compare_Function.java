/*
equals() Function...
    1. syntax--> variable_1.equals(variable_2);
    2. . equals is inbuilt function who is compare two string equals or not.
*/
public class String_equals_compare_Function{
    
    public static void main(String args[]){
        String s1 = "Tony";
        String s2 = "Tony";
        
        String s3 = new String("Tony");
        
        //--> This is Invaild syntax because create different object.
        /*if(s1==s3){
            System.out.println("String are equals");
        }
        else{
            System.out.println("String are not equals");
        }*/
        
        //--> This is vaild syntax, and use inbuilt function.
        if(s1.equals(s3)){
            System.out.println("String are equals");
        }
        else{
            System.out.println("String are not equals");
        }
        
    }
}