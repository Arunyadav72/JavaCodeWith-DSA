public class Switch_Statement{
    
    /*
    Switch statement....Syntax
           switch(condition){
                  case 1:   statement 1 
    
                  case 2:   statement 2
    
                  case 3:   statement 3
    
                  default:  statement
           }
    */
    
    public static void main(String args[]){
        int number = 2;
        
        switch(number){
            case 1:
                System.out.println("Samosha");
                break;
                
            case 2:
                System.out.println("Burgar");
                break;
                
            default:
                System.out.println("We wake up");
        }
    }
}
