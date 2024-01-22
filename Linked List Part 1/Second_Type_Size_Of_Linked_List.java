/*
*Remove Nth Node from end
---------------------------> It is taken O(n) time complexity.
*/

public class Second_Type_Size_Of_Linked_List{

    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    //!This Function work on calculate Linked List Length.
    public int calculate_Size(Node Head){
        int size = 0;
        if(Head == null){//!If Linked List is empty.
            return size;
        }

        //!If Linked List not empty.
        Node temp = Head;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        return size;
    }

    //*This is add begin Statement in Linked List.
    public void add_begin(int data){
        Node newnode = new Node(data);

        if(head == null){
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    //*This is add Last Statement in Linked List.
    public void add_Last(int data){
        Node newnode = new Node(data);

        if(head == null){
            head = tail = newnode;
            return;
        }

        tail.next = newnode;
        tail = newnode;
    }

    //*This is add middle Statement in Linked List.
    public void add_middle(int data, int index){
        if(index == 0){
            add_begin(data);
            return;
        }

        Node newnode = new Node(data);
        Node temp = head;
        int i=0;
        
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    //*This work on Print Linked List element.
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

    public static void  main(String args[]){
        Second_Type_Size_Of_Linked_List size = new Second_Type_Size_Of_Linked_List();

        //Store element in Linked List.
        size.add_begin(1);
        size.add_Last(2);
        size.add_Last(3);
        size.add_Last(5);
        size.add_Last(6);
        size.add_middle(4, 3);

        size.print();//!Invoked print method.

        //!This is calculate Linked List Length statement.
        int length = size.calculate_Size(head);
        System.out.println("Linked List Length is : "+length);
    }
}