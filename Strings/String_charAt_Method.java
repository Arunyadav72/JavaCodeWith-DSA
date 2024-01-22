/*
    charAt()
    ---------> 
             This method use print one - one character of string
             Syntax..
                   variable_name.charAt(index);
*/
public class String_charAt_Method{
    
    //This Method Print One - One Letter for string by using charAt() Method.
    public static void Print_one_one_Letter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        String name1 = "Shradha Khapara";
        String name2 = "Arun yadav";
        
        //Invoked Print_one_one_Letter Method.
        System.out.print("Name1 : ");
        Print_one_one_Letter(name1);
        System.out.print("Name2 : ");
        Print_one_one_Letter(name2);
    }
}