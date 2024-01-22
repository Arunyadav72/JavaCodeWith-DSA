public class break_Statement{
    /*
    break...
          exit the loop and switch.
    */
    public static void main(String args[]){
        
        for(int i=1; i<=5; i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loop");
    }
}
