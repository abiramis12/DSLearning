public class SinglyLinkedList {
    Node head;

    public void addAtFirst(int n){
        Node node=new Node(n);
        if (this.head != null) {
            node.next = head;
        }
        this.head = node;
    }

    public void addAtLast(int n){
        Node node=new Node(n);
        if(this.head==null)
            this.head=node;
        else{
            Node last=head;
            while(last.next!=null)
                last=last.next;
            last.next=node;
        }
    }
    public int getMiddle(){
        if(head==null)
            return -1;
        Node node=head;
        Node mid=head;
        while(node!=null && node.next!=null){
            mid=mid.next;
            node=node.next.next;
        }
        return mid.data;
    }
}
