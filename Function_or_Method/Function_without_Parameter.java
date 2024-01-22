/*
Function / Method... * Block of code /  reusable
        
     Syntax --> without parameter..
             
               returnType Function_name(){
                  //Function body;

                  return statement
               }
     
   Invoked Function / Method from Main Function..
   ............. 
   Function_name();
    

*/
public class Function_without_Parameter{
    
    //This is Function / Method line code.
    public static void Print_Hello_World(){
        System.out.println("Hello world");
    }
    
    public static void main(String args[]){
        
        //Invoked Print_Hello_World Function/Method.
        Print_Hello_World();
    }
}
