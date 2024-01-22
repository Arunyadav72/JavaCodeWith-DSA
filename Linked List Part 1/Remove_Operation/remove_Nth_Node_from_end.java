public class remove_Nth_Node_from_end{
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


    //*This Function calculate linked list Length(Size).
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

    //!This Function work on Remove Nth Node From end of Linked List.
    public int remove_nthNode(int deleteNode){
        calculate_Size(head);//Invoked calculate size Method.

        if(deleteNode > size || deleteNode<= 0){//!This statemnt true when delete Node not exists.
            System.out.print("\ndelete Node not exists");
            return Integer.MIN_VALUE;
        }

        if(deleteNode == size){//!This statement true when you are delete 1st node from end.
            int val = head.data;
            head = head.next;
            return val;
        }

        //!This statement true when you are delete any node from end.
        int i=1;//start Node.
        int toFind_deleIndex = size-deleteNode;//Find delete of previous Node statement.
        Node prev = head;
        while(i < toFind_deleIndex){//This reached delete of previous node.
            prev = prev.next;
            i++;
        }
        int val = prev.next.data;
        prev.next = prev.next.next;
        return val;
    }

    public static void main(String args[]){
        remove_Nth_Node_from_end list = new remove_Nth_Node_from_end();

        //store linked list data.
        list.add_Last(1);
        list.add_Last(2);
        list.add_Last(3);
        list.add_Last(4);
        list.add_Last(5);

        //!Invoked print Method Before Remove Nth Node from end.
        System.out.println("Print data before Remove Nth node from end ---> ");
        list.print();

        //!Invoked Remove Nth node form end Method.
        int Data = list.remove_nthNode(3);
        System.out.println("\nRemove data is : "+Data+"\n");

        //!Invoked print Method After Remove Nth Node from end.
        System.out.println("Print data After Remove Nth node from end ---> ");
        list.print();


    }
}