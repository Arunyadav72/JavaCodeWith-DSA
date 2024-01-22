/*
*Remove Last
-------------> It is taken O(n) time complexity.
*/
public class remove_Last{

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
    public static int size = 0;

    //*This Function calculate Linked List Length.
    public void calculate_Size(Node Head){
        if(Head == null){
            size = 0;
            return;
        }
        
        while(Head != null){
            size++;
            Head = Head.next;
        }
    }

    //*This is add Last element in Linked List Statement.
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

        System.out.print("Data is : ");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    //!This Function work on Remove last element in Linked List.
    public int Remove_Last(){
        calculate_Size(head);
        if(size == 0){//!This statement work only when linked list is empty.
            System.out.print("\nLinked List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){//!This statement work only when linked list store only one data.
            int val = head.data;
            head = tail = null;
            size = 0;//here, decrease linked list size.
            return val;
        }
        else{//!This statement work only when linked store maximum data.
            Node prev = head;
            while(prev.next != tail){
                prev = prev.next;
            }
            int val = tail.data;
            prev.next = null;
            tail = prev;
            size--;//here, decrease linked list size.
            return val;
        }
    }
    public static void main(String args[]){
        remove_Last list = new remove_Last();

        //store linked list data.
        list.add_Last(1);
        list.add_Last(2);
        list.add_Last(3);
        list.add_Last(4);

        //!Invoked Print Method Before Remove Last.
        System.out.println("Print Data Before Remove Last -----> ");
        list.print();

        //!Invoked Remove_Last Method.
        int Data = list.Remove_Last();
        System.out.println("\nRemove data is : "+Data+"\n");

        //!Invoked Print Method After Remove Last.
        System.out.println("Print Data After Remove Last -----> ");
        list.print();

    }
}