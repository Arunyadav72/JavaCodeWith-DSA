/*

*Remove begin
----------------> It is taken O(1) time complexity.
*/

public class remove_begin{

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
    public static int Size = 0;

    //*This Function calculate Linked List size.
    public void calculate_Size(Node Head){
        if(Head == null){
            Size = 0;
            return;
        }

        while(Head!=null){
            Size++;
            Head = Head.next;
        }
    }
    //*This is add begin statement in Linked List.
    public void add_begin(int data){
        Node newnode = new Node(data);

        if(head == null){
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    //*This work on Print Linked List element.
    public void print(){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }

        System.out.print("Data is : ");
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    //! This is remove begin element in Linked List.
    public int Remove_begin(){
        if(Size == 0){//!If Linked list is empty statement.
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;//return -infinity value;
        }
        else if(Size == 1){//!Jab List ke andar only one data ho.
            int val = head.data;
            head = tail = null;
            Size = 0;//Here, decrease linked lsit size.
            return val;
        }
        else{//!Jab Linked list ke andar max data ho.
            int val = head.data;
            head = head.next;
            Size--;//Here, decrease size.
            return val;
        }
    }

    public static void  main(String args[]){
        remove_begin list = new remove_begin();

        //store element in Linked list.
        list.add_begin(1);
        list.add_begin(2);
        list.add_begin(3);
        list.add_begin(4);

        //!Invoked Print Method.
        System.out.println("Before remove begin in Linked List-----> ");
        list.print();


        //! Invoked Remove_begin Method.
        list.calculate_Size(head);
        int data = list.Remove_begin();
        System.out.println("\nRemove data is : "+data+"\n");

        //!Invoked Print Method.
        System.out.println("After remove begin in Linked List-----> ");
        list.print();
        System.out.println("Size : "+Size);

    }
}