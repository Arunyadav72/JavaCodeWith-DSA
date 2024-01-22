public class Print_a_Linked_List{

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

    //!This Function work on Print Linked List Element.
    public void Print(){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;
        System.out.print("Data is : ");
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    //This is Add begining  in Linked List.
    public void Add_begin(int data){
        Node newnode = new Node(data);
        if(head == null){//If list is empty.
            head = tail = newnode;
            return;
        }
        //if list is not empty.
        newnode.next = head;
        head = newnode;
    }

    //This is Add Last in Linked List.
    public void Add_Last(int data){
        Node newnode = new Node(data);
        if(head == null){//If list is empty.
            head = tail = newnode;
            return;
        }
        //If list is not empty.
        tail.next = newnode;
        tail = newnode;
    }

    public static void main(String args[]){
        Print_a_Linked_List list = new Print_a_Linked_List();

        //Invoked Add begin Method.
        list.Add_begin(1);
        list.Add_begin(2);
        list.Add_begin(3);
        
        //!Invoked Print Method.
        System.out.println("Add begin Linekd List :--> ");
        list.Print();


        //Invoked Add Last Method.
        list.Add_Last(1);
        list.Add_Last(2);
        list.Add_Last(3);

        //!Invoked Print Method.
        System.out.println("\nAdd Last Linekd List :--> ");
        list.Print();
    }
}