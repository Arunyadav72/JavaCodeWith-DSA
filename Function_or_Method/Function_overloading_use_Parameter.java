public class Function_overloading_use_Parameter{
    //This Function to calculate sum of 2 number parameter.
    public static int Sum(int a, int b){
        return a+b;
    }
    
    //This Function to calculate sum of 3 number parameter.
    public static int Sum(int a, int b, int c){
        return a+b+c;
    }
    /*
    First Function and Second Function name same but parameter different.
    its called Function overloading.
    */
    
    public static void main(String args[]){
      System.out.println("Sum : "+Sum(5, 3));//Invoked First Function
      System.out.println("Sum : "+Sum(5, 3, 2));//Invoked Second Function
    }
}
