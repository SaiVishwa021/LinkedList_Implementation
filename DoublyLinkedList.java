public class DoublyLinkedList {
    private int size;
    private Node head;

    DoublyLinkedList(){
        size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        if(head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }
    public void insertLast(int val){
        if(size == 0){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node temp = getRef(size - 1);
        temp.next = node;
        node.prev = temp;
        size++;
    }
    public void insertAt(int val, int ind){
        if(ind < 0 || ind > size ){
            return;
        }
        if(ind == 0){
            insertFirst(val);
            return;
        }
        if(ind == size){
            insertLast(val);
            return;
        }
        Node node = new Node(val);
        Node temp = getRef(ind - 1);
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        node.next.prev = node;
        size++;
    }
    private Node getRef(int ind){
        Node temp = head;
        for(int i=0; temp != null && i<ind; i++){
            temp = temp.next;
        }
        return temp;
    }
    public void display(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public void displayRev(){
        Node temp = getRef(size);
        while(temp != null){
            System.out.print(temp.val + " <-- ");
            temp = temp.prev;
        }
        System.out.println("Start");
    }
    private static class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(Node next, Node prev) {
            this.next = next;
            this.prev = prev;
        }

    }
}
