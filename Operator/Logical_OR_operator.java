/*
    point....
    Logical OR operator order.....
    symbol=> ||
        
        Statement1  statement2  output
        True         True        True
        True         False       True
        False        True        True
        False        False       False
*/
public class Logical_OR_operator{
    public static void main(String args[]){
        System.out.println((3>2)||(5>0));
        System.out.println((3>2)||(0>5));
        System.out.println((2>3)||(5>0));
        System.out.println((2>3)||(0>5));
    }
}
