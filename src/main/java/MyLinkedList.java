class MyLinkedList {

    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }

    Node head;
    int size;

    public MyLinkedList() {
        this.head=null;
        this.size=0;
    }


    public int get(int index) {

        if(index<0 || index>=size)
            return -1;
        Node next=head;
        for(int i=0;i<index;i++)
            next=next.next;
        return next.val;


    }

    public void addAtHead(int val) {
        Node node= new Node(val);
        if (head != null) {
            node.next = head;
        }
        head=node;
        size++;
    }

    public void addAtTail(int val) {

        if(head==null)
        {
            addAtHead(val);
            return;
        }
        else{
            Node node= new Node(val);
            Node next=head;
            while(next.next!=null)
                next=next.next;
            next.next=node;
        }
        size++;

    }

    public void addAtIndex(int index, int val) {
        if(index<0 || index>size)
            return;
        Node node= new Node(val);
        if(index==0){
            addAtHead(val);
        }
        else if(index==size){
            addAtTail(val);
        }
        else{
            Node next=head;
            for(int i=0;i<index-1;i++)
                next=next.next;
            node.next=next.next;
            next.next=node;
            size++;
        }
    }





    public void deleteAtIndex(int index) {
        if(index<0 || index>=size)
            return;
        Node prev=head;
        for(int i=0;i<index-1;i++)
            prev=prev.next;
        prev.next=prev.next.next;

    }
    public static void main(String[] args) {

        MyLinkedList obj = new MyLinkedList();

        obj.addAtHead(1);
        obj.addAtTail(3);
        obj.addAtIndex(1, 2);
        obj.deleteAtIndex(1);
    }
}


