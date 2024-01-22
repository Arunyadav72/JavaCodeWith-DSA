public class Function_overloading_use_dataType{
    //This Function to calculate Sum of 2 number.
    public static int Sum(int a, int b){
        return a+b;
    }
   
    //This Function to calculate Sum of 2 number.
    public static float Sum(float a, float b){
        return (float)a+b;
    }
    /*
    First Function and Second Function name and parameter same but diffent data type.
    */
    public static void main(String args[]){
      System.out.println("Sum is : "+Sum(5, 10));
      System.out.println("Sum is: "+Sum(15.0f, 10.0f));
      
    }
}
