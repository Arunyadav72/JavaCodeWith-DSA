public class Print_x_to_the_power_n_Optimized_Code{

    public static int Find_power(int x, int n){
        //BASE CASE
        if(n==0){
            return 1;
        }

        //KAAM
        int halfpower = Find_power(x, n/2);
        System.out.println(halfpower);
        int halfpowersq = 1; //= halfpower*halfpower;
        if(n%2==0){
            halfpowersq = halfpower*halfpower;
        }
        else{
            halfpowersq = (x*halfpowersq);
        }

        //if(n%2!=0){
        //    halfpowersq = (x*halfpowersq);
        //}

        return halfpowersq;
    }
    public static void main(String args[]){
        int x = 2;
        int n = 10;

        System.out.println(Find_power(x, n));
    }
}