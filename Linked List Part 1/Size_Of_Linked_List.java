public class Size_Of_Linked_List{

    public static class Node{
        int data;//Its node of data;
        Node next;//Its node of refrence(pointer)

        public Node(int data){//its constructor.
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size = 0;//! Its calculate Linked List length.

    //*This Function add begin element in Linked List.
    public void add_begin(int data){
        Node newnode = new Node(data);
        size++;//!It is calculate Length.

        if(head == null){
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    //*This Function add Last element in Linked List.
    public void add_Last(int data){
        Node newnode = new Node(data);
        size++;//!Its is calculate Length.

        if(head==null){
            head = tail = newnode;
            return;
        }

        tail.next = newnode;
        tail = newnode;
    }

    //*This Function add middle element in Linked List.
    public void add_middle(int data, int index){
        if(index == 0){
            add_begin(data);
            return;
        }

        Node newnode = new Node(data);
        size++;//!It is calculate Length.

        Node temp = head;
        int i=0;
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    //*This Function work on Print Linked List element.
    public void print(){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }

        System.out.print("Data is : ");
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        Size_Of_Linked_List Size = new Size_Of_Linked_List();

        //Store element in Linekd List
        Size.add_begin(1);
        Size.add_Last(2);
        Size.add_Last(3);
        Size.add_Last(5);
        Size.add_Last(6);
        Size.add_middle(4, 3);

        Size.print();//!Invoked print Method.

        //!This Statement Print Linked List Length.
        System.out.println("Linked List Length is : "+size);
    }
}