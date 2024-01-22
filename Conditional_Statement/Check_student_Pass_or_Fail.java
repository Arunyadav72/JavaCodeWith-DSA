import java.util.*;
public class Check_student_Pass_or_Fail{
    
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int marks;
        
        System.out.print("enter the student marks : ");
        marks = sc.nextInt();
        
        String report_card = (marks>33)? "PASS" : "FAIL";
                
        System.out.println("Student is : "+report_card);
    }
}
