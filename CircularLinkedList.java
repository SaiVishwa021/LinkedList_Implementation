public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size;
    CircularLinkedList(){
        this.size = size;
    }
    private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            size++;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    public void delete(int val){
        Node node = head;
        if(node == null){
            return;
        }
        if(node.val == val){
            head = head.next;
            tail.next = head;
            size--;
            return;
        }
        do{
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);
        size--;
    }

    public void display(){
        Node temp = head;
        do{
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }while(temp != head);
        System.out.println("End");
    }
}
