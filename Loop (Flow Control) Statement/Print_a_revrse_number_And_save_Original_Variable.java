public class Print_a_revrse_number_And_save_Original_Variable{
    public static void main(String args[]){
        int n = 10889;
        int reverse = 0;
        while(n!=0){
            int last_digit = n%10;
            reverse = (reverse*10)+last_digit;
            n/=10;
        }
        
        n = reverse; // Save reverse number in Original Variable.
        
        System.out.println("reverse number is : "+n);
    }
}
