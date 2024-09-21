package MazeProblems.linkedList;

public class Main {
    public static void main(String[] args) {
//        CustomLinkedList list = new CustomLinkedList();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(17);
//        list.insertFirst(4);
//        list.insertLast(99);
//        list.insert(100, 3);
//        list.display();
//        list.deleteLast();
//        list.display();
//        list.delete(2);
////        list.deleteFirst();
//        list.display();
//        DoubleLinkedList list = new DoubleLinkedList();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(8, 56);

        CircularLInkedList list = new CircularLInkedList();
        list.insert(3);
        list.insert(23);
        list.insert(43);
        list.insert(36);
        list.insert(83);


        list.display();

        list.delete(43);
        list.display();



    }
}
