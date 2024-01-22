/*
*Reverse Linked List
----------------------> It is taken O(n) time complexity.
*/
public class Reverse_in_Linked_List{

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

    //*This Function work on Print Linked List element.
    public void print(){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }

        System.out.print("data is : ");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    //!This Function work on Reverse Linked List element.
    public void reverse(){
        Node prev = null;//!It is previoud node.
        Node curr = head;//!It us current node.
        Node forword;//!It is next node.

        while(curr != null){//!Here, actual reverse.
            forword = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forword;
        }
        head = prev;
    }

    public static void main(String args[]){
        Reverse_in_Linked_List list = new Reverse_in_Linked_List();

        //store linked list element.
        list.add_Last(1);
        list.add_Last(2);
        list.add_Last(3);
        list.add_Last(4);
        list.add_Last(5);

        //!Invoked print Method without Reverse.
        System.out.println("Non Reverse ----> ");
        list.print();

        //!Invoked Reverse Method.
        list.reverse();

        //!Invoked print Method with Reverse.
        System.out.println("\nReverse ----> ");
        list.print();
    }
}