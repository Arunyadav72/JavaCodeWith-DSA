/*
point.....
1. unary arithmetic operator are two type.
   (i) increament
   (ii) Decreament

2. increament operator are two type
   (i)pre increament
   (ii) post increament

3. Decreament operator are two type
   (i)pre Decreament
   (ii) post Decreament

*/
public class unary_arithmetic_operator{
    public static void main(String args[]){
        
      System.out.println("This is pre increament operator :");
      int a = 10;
      int b = ++a;
      //1. before value change.
      //2. then the use value.
      System.out.println(a);
      System.out.println(b);
      
      System.out.println("This is post increament operator :");
      int c = 10;
      int d = c++;
      //1. before use value.
      //2. then the change value.
      System.out.println(c);
      System.out.println(d);
      
      System.out.println("This is pre Decreament operator :");
      int a1 = 10;
      int b1 = --a1;
      //1. before change value.
      //2. then the use value.
      System.out.println(a1);
      System.out.println(b1);
      
      System.out.println("This is post Decreament operator :");
      int c1 = 10;
      int d1 = c1--;
      //1. before use value.
      //2. then the change value.
      System.out.println(c1);
      System.out.println(d1);
   }
}
