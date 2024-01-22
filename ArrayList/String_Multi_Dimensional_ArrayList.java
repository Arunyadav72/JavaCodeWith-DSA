import java.util.ArrayList;
public class String_Multi_Dimensional_ArrayList{
    public static void main(String args[]){
        //declare multi dimensional ArrayList.
        ArrayList<ArrayList<String>> mainList = new ArrayList<>();

        //small ArrayList
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> surname = new ArrayList<>();

        //store value in small ArrayList.
        name.add("Arun"); surname.add("Yadav");
        name.add("Saurabh"); surname.add("Yadav");
        name.add("Siddesh"); surname.add("Katale");

        //store small ArrayList value in Multi Dimensional ArrayList.
        mainList.add(name);
        mainList.add(surname);


        //Print Multi Dimensional ArrayList.
        System.out.println("Value is : "+mainList);
    }
}