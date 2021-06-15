import lombok.Data;

@Data
public class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
