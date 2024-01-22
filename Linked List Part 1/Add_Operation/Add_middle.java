public class Add_middle{

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

    //!This Function work on Add element at Middle in Linked List.
    public void add_middle(int data, int index){
        Node newnode = new Node(data);//Here, declare newnode.
        
        if(index == 0){//*If index is Zero.
            Add_begin(data);//Invoked Add begin Method.
            return;
        }

        //*If index is not Zero.
        Node temp = head;
        int i=0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    //!This is Add begin in Linked List.
    public void Add_begin(int data){
        Node newnode = new Node(data);
        if(head == null){//if list is empty.
            head = tail = newnode;
            return;
        }
        //If list is not empty.
        newnode.next = head;
        head = newnode;
    }

    //!This Function work on Print List.
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

    public static void main(String args[]){
        Add_middle list = new Add_middle();
        
        //Invoked Add begin Method.
        list.Add_begin(1);
        list.Add_begin(2);
        list.Add_begin(3);
        list.Add_begin(4);

        //Print Data without perform Add middle statement.
        list.Print();

        //!Invoked Add middle Method. (any given index).
        System.out.println("\nAdd Middle statement ---> ");
        list.add_middle(100, 2);

        //Print Data with perform Add middle statement.
        list.Print();
    }
}