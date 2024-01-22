public class Data_Type_conversion{
    public static void main(String args[]){
        int a = 25;
        long b = a; // This is data type conversion statement.
        //Data type conversion is small data type convert from Long data type.
        
        System.out.println("long value = "+b);
        
        /*
        long c = 15;
        int d = c; //this data type conversion not possible because Long data not convert small data.
       */        
        
        int c = 23;
        float d = c; // data type convert int to float.
        System.out.println("Value = "+d);
        
    }
}