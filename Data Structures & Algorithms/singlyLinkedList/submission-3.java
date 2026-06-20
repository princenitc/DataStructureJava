class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

class LinkedList {   
    private Node head;
    public LinkedList() {

    }

    public int get(int index) {
        Node curr = head;
        int count = 0;
        while(curr != null) {
            if(count == index)
                return curr.data;
            curr = curr.next;
            count++;
        }
        return -1;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.next = this.head;
        head = newNode;
    }

    public void insertTail(int val) {
        Node curr = this.head;
        if(curr == null) {
            Node newNode = new Node(val);
            this.head = newNode;
            return;
        }
        while(curr.next != null) 
            curr = curr.next;
        Node newNode = new Node(val);
        curr.next = newNode;
    }

    public boolean remove(int index) {
        Node curr = head;
        int count = 0;
        Node prevNode = null;
        if (index == 0) {
            if(head == null)
                return false;
            head = head.next;
            return true;
        }
        while(curr != null) {
            if(count == index) {
                prevNode.next = curr.next;
                return true;
            }
            prevNode = curr;
            curr = curr.next;
            count++;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> arr = new ArrayList<>();
        Node curr = head;
        while(curr != null) {
            arr.add(curr.data);
            curr = curr.next;
        }
        return arr;
    }
}
