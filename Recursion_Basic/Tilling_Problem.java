public class Tilling_Problem{

    public static int Tilling_solution(int n){
        //BASE CASE
        if(n==1 || n==0){
            return 1;
        }

        //KAAM.
        //*1. vertical choice.
        int fnm1 = Tilling_solution(n-1);
        //*2. horizantal choice.
        int fnm2 = Tilling_solution(n-2);

        int Total_way = fnm1+fnm2;

        return Total_way;

    }

    public static void main(String args[]){

        System.out.println("Number of ways : "+Tilling_solution(2));
        System.out.println("Number of ways : "+Tilling_solution(3));
        System.out.println("Number of ways : "+Tilling_solution(4));

    }
}