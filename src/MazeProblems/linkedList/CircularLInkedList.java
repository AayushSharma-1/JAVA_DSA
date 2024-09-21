package MazeProblems.linkedList;

public class CircularLInkedList {

    private Node head;
    private Node tail;

    public CircularLInkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;

    }

    public void display(){
        Node node = head;
        if(head != null){
            do {
                System.out.print(node.val + " -> ");
                node = node.next;
            } while(node != head);

        }
        System.out.println("HEAD");
    }

    public void delete(int val){
        Node node = head;
        if(node == null){
            System.out.println("List is empty");
        }
        if(node.val == val){
            head = head.next;
            tail.next = head;
        }
        do{
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;

        }while(node != head);
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
