/*Ouestion..
      What will be the output of following programs.
*/
public class Question3{
    public static void main(String args[]){
        int x, y, z;
        x=y=z = 2;
        x+=y;
        y-=z;
        z/=(x+y);
        
        System.out.println("Value is : "+x+" "+y+" "+z);
    }
}