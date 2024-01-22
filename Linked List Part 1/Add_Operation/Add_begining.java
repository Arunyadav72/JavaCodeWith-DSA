public class Add_begining{

    //!Here, declare Linked Node.
    public static class Node{
        int data;//Its node of data.
        Node next;//Its node of refrence

        public Node(int data){//Its constructor
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;//Its node of head
    public static Node tail;//Its node of tail

    //!This Function work on Add element at begining in the Linked List.
    public void Add_begin(int data){
        Node newnode = new Node(data);//Here, create new node.

        if(head == null){//*If list is empty.
            head = tail = newnode;
            return;
        }
        //*If list is not empty.
        newnode.next = head;
        head = newnode;
    }

    public static void main(String args[]){
        Add_begining list = new Add_begining();

        //!Here, Invoked Add begining Method.
        list.Add_begin(1);
        list.Add_begin(2);
        list.Add_begin(3);
    }
}

//! Assume Output
//--------------------> 3  2  1
//* It is taken O(1) time complexity.