/*
Question 4.....
What will be the  value of x and y int the following program.

public class Question_4{
    public static void main(String args){
        int a = 65, b = 36;
        boolean x = (a<b)? true : false;
        int y = (a>b)? a:b;
    }
}
*/
public class Question_4{
    public static void main(String args[]){
        int a = 65, b = 36;
        boolean x = (a<b)? true:false;
        int y = (a>b)? a:b;
        
        System.out.println("x value is : "+ x);
        System.out.println("y value is : "+ y);
    }
}