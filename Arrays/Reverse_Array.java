public class Reverse_Array{
    
    //This is reverse array method..
    public static void reverse_array(int number[]){
        int start = 0;
        int end = number.length-1;
        
        while(start < end){
            //Here Swaping..
            int tem = number[start];
            number[start] = number[end];
            number[end] = tem;
            
            start++;
            end--;
        }
    }
    
    //This is print array method.
    public static void Print_Array(int number[]){
        for(int i=0; i<number.length; i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String agrs[]){
        int number[] = {2, 4, 6, 8, 10};
        
        //output..
        System.out.print("Non reverse array : ");
        Print_Array(number);
        
        reverse_array(number);  //Invoked reverse array method..
        
        System.out.print("Reverse array : ");
        Print_Array(number);
    }
}