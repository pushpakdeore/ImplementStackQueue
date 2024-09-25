package pushpak40ImplementStackQueue;

public class implementStack {
    private Node top;

    public implementStack() {
        this.top = null;
    }


    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if(top ==null){
            top = newNode;
        }else {
            newNode.next = top;//connect karata top la ani newnode la
            top = newNode;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Unable to pop.");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        System.out.println("Popped " + poppedData + " from the stack.");
        return poppedData;
    }


    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;
        }
        return top.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        Node current = top;
        System.out.println("Stack elements are: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}


