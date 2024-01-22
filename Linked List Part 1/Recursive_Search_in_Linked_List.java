/*
*Question
---------> Search for a key in linked list. Return index where it is found.
           If not found, return -1.
           
*Recursive Search
-------------------> 1. It is taken O(n) time complexity.
                     2. It is taken (n) space complexity.
*/
public class Recursive_Search_in_Linked_List{
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

    //*This is add Last element in Linked List.
    public void add_Last(int data){
        Node newnode = new Node(data);

        if(head == null){
            head = tail = newnode;
            return;
        }

        tail.next = newnode;
        tail = newnode;
    }

    //!This Function work on Search key in Linked List.
    public int search(Node Head, int key){
        //!It is Base case.
        if(Head == null){
            return -1; //!Key not found.
        }

        if(Head.data == key){
            return 0;//!It is key found statement.
        }

        //!Here, recursive call.
        int index = search(Head.next, key);

        //!Here return current index of key(backtracking).
        if(index == -1){
            return -1;
        }
        else{//!actual index found.
            return index+1;
        }
    }

    public static void main(String args[]){
            Recursive_Search_in_Linked_List list = new Recursive_Search_in_Linked_List();

            //store linked list data.
            list.add_Last(1);
            list.add_Last(2);
            list.add_Last(3);
            list.add_Last(4);
            list.add_Last(5);

            int key = 3;

            //!Invoked search Method.
            int index = list.search(head , key);

            if(index != -1){
                System.out.println("Key index is : "+index);
            }
            else{
                System.out.println("key index not found");
            }
        }
}