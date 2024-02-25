public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertFirst(10);
        l.insertFirst(20);
        l.insertFirst(30);
        l.insertFirst(40);
        l.insertFirst(50);
        l.insertFirst(60);
        l.insertFirst(70);
        l.insertAt(0, 5);
        l.display();
        System.out.println(l.deleteFirst());
        l.display();
        System.out.println(l.deleteLast());
        l.display();
        System.out.println(l.deleteAt(2));
        l.display();



        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertFirst(3);
        dl.insertFirst(2);
        dl.insertFirst(1);
        dl.displayRev();
        dl.insertLast(0);
        dl.display();
        dl.insertLast(99);
        dl.insertLast(100);
        dl.display();
        dl.insertAt(824, 0);
        dl.display();

        CircularLinkedList cl = new CircularLinkedList();
        cl.insertFirst(10);
        cl.insertFirst(20);
        cl.insertFirst(30);
        cl.display();
        cl.delete(20);
        cl.display();
        cl.delete(20);
        cl.display();
    }
}