/*
*Question
----------> Search for a key in a Linked list. Return the position where it is found.
            If not found, return -1.

*Iterative Search
------------------> It is taken O(n) time complexity.
*/
public class Iterative_Search_In_Linked_List{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    //*This is add Last element in Linked list.
    public void add_Last(int data){
        Node newnode = new Node(data);

        if(head == null){
            head = tail = newnode;
            return;
        }

        tail.next = newnode;
        tail = newnode;
    }

    //!This Function work on Search Key position in Linked List.
    public int search(int key){//* O(n) time complexity.
        Node temp = head;
        int position = 0;

        while(temp != null){
            if(temp.data == key){//!This is key found statement.
                return position+1;
            }
            //!This statement true when if condition is false.
            temp = temp.next;
            position++;
        }
        return -1; //!This is key not found statement.
    }

    public static void main(String args[]){
        Iterative_Search_In_Linked_List list = new Iterative_Search_In_Linked_List();

        //store linked list element.
        list.add_Last(1);
        list.add_Last(2);
        list.add_Last(3);
        list.add_Last(4);
        list.add_Last(5);

        int key = 3;

        //!Invoked search Method.
        int position = list.search(key);

        if(position != -1){
            System.out.println("Key position is : "+position);
        }
        else{
            System.out.println("Key position not found");
        }
    }
}