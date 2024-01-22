public class Array_Function_arguments{
    
    //This is Array of Function...
    public static void Update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1;
        }
    }
    
    public static void main(String agrs[]){
        int marks[] = {97, 98, 99}; //Here declare Array.
        
        //Invoked update Function..
        Update(marks);
        
        //output..
        for(int i=0; i<marks.length; i++){
            System.out.println(i+" marks : "+marks[i]);
        }
 
    }
}