import java.util.ArrayList;
import java.util.Scanner;

//!Here, I am use sort algorithms in ArrayList. (Increasing order)
public class Sort_ArrayList_without_Inbuilt_Method{

    //!This is Selection Sort Method.
    public static void Selection_sort(ArrayList<Integer> list){
        for(int i=0; i<list.size()-1; i++){
            int min = i;
            for(int j = i+1; j<list.size(); j++){
                if(list.get(j) < list.get(min)){
                    min = j;
                }
            }
            //swap statement.
            int tem = list.get(i);
            list.set(i, list.get(min));
            list.set(min, tem);
        }
    }

    //! This is Bubble sort Method.
    public static void Bubble_sort(ArrayList<Integer> list){
        for(int i=0; i<list.size()-1; i++){
            for(int j=0; j<list.size()-i-1; j++){
                
                if(list.get(j) > list.get(j+1)){
                    //swap statement.
                    int tem = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, tem);
                }
            }
        }
    }

    //!This Insertion sort method.
    public static void Insertion_sort(ArrayList<Integer> list){
        for(int i=1; i<list.size(); i++){
            int tem = list.get(i);
            int j = i-1;

            while(j>=0 && tem <list.get(j)){
                list.set((j+1), list.get(j));
                j--;
            }
            list.set((j+1), tem);
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        //store element.
        list.add(23);
        list.add(15);
        list.add(10);
        list.add(30);
        list.add(5);

        while(true){
            System.out.println("1. Selection sort\n2. Bubble sort\n3. Insertion sort\n4. exit");
            System.out.print("enter your choice : ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                System.out.println("Unsorted : "+list); //print element before sorting..
                Selection_sort(list);//!Invoked Selection sort method.
                System.out.println("sorted : "+list); //print element after sorting.
                System.out.println();
                break;

                case 2:
                System.out.println("Unsorted : "+list); //print element before sorting..
                Bubble_sort(list);//!Invoked Selection sort method.
                System.out.println("sorted : "+list); //print element after sorting.
                System.out.println();
                break;

                case 3:
                System.out.println("Unsorted : "+list); //print element before sorting..
                Insertion_sort(list);//!Invoked Selection sort method.
                System.out.println("sorted : "+list); //print element after sorting.
                System.out.println();
                break;

                case 4:
                System.exit(0);
                break;

                default:
                System.out.println("Choice number is wrong");
                System.out.println();

            }
        }
    }
}