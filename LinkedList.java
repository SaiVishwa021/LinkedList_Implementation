public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    public LinkedList(){
        this.size = 0;
    }

    public static class Node{
        private final int val;
        private Node next;
        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int val){
        //Using tail
        if(head == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

        //Without using tail.
//        Node node = new Node(val);
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//        temp.next = node;
//        tail = node;
//
    }

    public void insertAt(int val, int ind){
        if(ind < 0 || ind > size+1) {
            return;
        }
        if(ind == 0){
            insertFirst(val);
            return;
        }
        if(ind == size+1){
            insertLast(val);
            return;
        }

        Node node = new Node(val);
        Node temp = head;
        for(int i=1; i<ind; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;

        // 2nd method
        // Node node = new Node(val, temp.next);
        // temp.next = node;
    }

    public int deleteFirst(){
        if(head == null){
            return -1;
        }
        int val = head.val;
        head = head.next;
        size--;
        return val;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        tail = getRef(size - 2);
        int val = tail.val;
        tail.next = null;
        size--;
        return val;
    }

    public int deleteAt(int ind){
        if(size == 0 || ind >= size || ind < 0){
            return -1;
        }
        if(ind == 0){
            return deleteFirst();
        }
        if(ind == size - 1){
            return deleteLast();
        }
        Node temp = getRef(ind - 1);
        int val = temp.val;
        temp.next = temp.next.next;
        return val;
    }

    public Node getRef(int ind){
        Node temp = head;
        for(int i=0; i<=ind; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

}
