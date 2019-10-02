public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        head = null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        }
        else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove() {
        Node runner = head;
        if(runner.next == null) {
            head = null;
        }
        else {
            while(runner.next.next != null) {
                runner = runner.next;
            }
            runner.next = null;
        }
    }

    public void printValues() {
        Node runner = head;
        if(runner != null) {
            System.out.println(runner.value);
            while(runner.next != null) {
                System.out.println(runner.next.value);
                runner = runner.next;
            }
        }
    }
}