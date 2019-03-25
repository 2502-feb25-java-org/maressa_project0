class _CodingChallenge1_Week4
{
    //Making my version of a LinkedList
    public Node head;
    public static void main(String[] args){

    }

    //Adds a Link to the head by putting to front of list
    public void addFirst(int data) {
        Node head = new Node(data, head);
        //head is the pointer to the first node.

        //traverse the list to replace current positions
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
        }
    }

    //Adds Link to end of list
    public void addLast(int data) {
        if(head == null) {
            addFirst(data);
            //When the list is empty, i.e, head points to null
        }
        else {  
            //When list is populated
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
                temp.next = new Node(data, null);
            }
        }
    }
}

/* Node class to create the node (object) takes integer 
parameters
*/

class Node{
    public int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public String toString() {
        return data + " ";
    }
}
