public class How_to_declare_Linked_List_head_and_tail{
    public static class Node{
        int data;//Its Node of data.
        Node next;//Its Node of refrence(pointer).

        public Node(int data){ //Its constructor.
            this.data = data;
            this.next = null;
        }
    }
    //!Here, declare Head and Tail.
    public static Node head;
    public static Node tail;

    public static void main(String args[]){

    }
}