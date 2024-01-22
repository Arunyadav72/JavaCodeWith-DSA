public class Find_Mid_Node_Value_inLinkedList{

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

    //!This Function work on Find mid Node value in Linked List.
    public Node Find_Mid_Node_Value(Node Head){
        Node slow = Head;
        Node fast = Head;

        while(fast != null && fast.next != null){
            slow = slow.next;//+1 increament.
            fast = fast.next.next;//+2 increament.
        }
        return slow;//! slow is my mid Node.
    }

    public static void main(String args[]){
        Find_Mid_Node_Value_inLinkedList list = new Find_Mid_Node_Value_inLinkedList();

        //store linked list element.
        list.add_Last(1);
        list.add_Last(2);
        list.add_Last(3);
        list.add_Last(4);
        list.add_Last(5);

        //!Invoked print Method.
        list.print();

        //!Invoked Find Mid Node Method.
        Node midNode = list.Find_Mid_Node_Value(head);
        System.out.println("Mid Node value is : "+midNode.data);
    }
}