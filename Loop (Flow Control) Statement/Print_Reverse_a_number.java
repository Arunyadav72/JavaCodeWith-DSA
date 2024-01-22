public class Print_Reverse_a_number{
    public static void main(String args[]){
        int n = 10889;
        
        while(n!= 0){
            int last_digit = n%10; 
            System.out.print(" "+last_digit);
            n/=10;
        }
        System.out.println();
    }
}