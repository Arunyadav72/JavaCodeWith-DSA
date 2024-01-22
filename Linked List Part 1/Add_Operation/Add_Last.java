public class Add_Last{
    //! Here, declare Node.
    public static class Node{
        int data;//Its node of data.
        Node next;//Its node of refrence.

        public Node(int data){//Its constructor
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;//Its node of head.
    public static Node tail;//Its node of tail.

    //!This Function work on Add element at Last in Linked List.
    public void add_Last(int data){
        Node newnode = new Node(data);//Here, create a newnode.
        
        if(head == null){//*If list is empty.
            head = tail = newnode;
            return;
        }
        //*If list is not empty.
        tail.next = newnode;
        tail = newnode;
    }

    public static void main(String args[]){
        Add_Last list = new Add_Last();

        //!Here, Invoked add Last Method.
        list.add_Last(1);
        list.add_Last(2);
        list.add_Last(3);
    }
}

//! Assume Output
//--------------------->   1  2  3
//* It is taken O(1) time complexity.