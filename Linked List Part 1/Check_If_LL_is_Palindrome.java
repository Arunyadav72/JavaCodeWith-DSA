/*
*Note point
-----------> 1. It is taken O(n) time complexity.
             2. It is taken O(1) space complexity.
             
*/
public class Check_If_LL_is_Palindrome{

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

    //!This Function work on Find mid Node
    //!slow and fast approach.
    public Node Find_Mid_Node(Node Head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next != null){
            slow = slow.next;//+1 increament.
            fast = fast.next.next;//+2 increament.
        }

        return slow;//! slow is My mid Node.
    }

    //!This Function work on check Palindrome in Linked List.
    public boolean check_Palindrome(){
        //!This statement true when linked list empty or exits only 1 data.
        if(head == null || head.next==null){
            return true;//Is palindrome statement.
        }

        //! Step 1. Find mid Node
        Node midNode = Find_Mid_Node(head);//Invoked Method.

        //! Step 2. Reverse 2nd Half Statement.
        Node prev = null;
        Node curr = midNode;
        Node forword;
        while(curr != null){
            forword = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forword;
        }

        //! Step 3. Check Left half and right half(chek Palindrome).
        Node Left = head;//Its like actual head.
        Node right = prev;//Its like reverse head.

        while(right != null){
            if(Left.data != right.data){
                return false;//! Is not Palindrome statement.
            }

            right = right.next;
            Left = Left.next;
        }
        return true;//!Is Palindrome statement.
    }

    public static void main(String args[]){
        Check_If_LL_is_Palindrome list  = new Check_If_LL_is_Palindrome();

        //store linked list element.
        list.add_Last(1);
        list.add_Last(2);
        list.add_Last(2);
        list.add_Last(1);

        //!Invoked check Palindrome Method.
        if(list.check_Palindrome() == true){
            System.out.println("Linked List is Palindrome");
        }
        else{
            System.out.println("Linked List is not Palindrome");
        }
    }
}