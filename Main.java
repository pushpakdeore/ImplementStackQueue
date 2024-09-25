package pushpak40ImplementStackQueue;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Main{
    public static void main(String[] args) {
        //push pop peek isemply
        implementStack stack =new implementStack();
        stack.push(12);
        stack.push(23);
        stack.push(12);
        stack.push(34);
        stack.push(5);
        stack.push(1);
        stack.peek();
        stack.pop();
        stack.isEmpty();
        stack.display();

        //queue
        // isEmpty(),enqueue, dequeue(),peek() ,display()
        implementQueue queue = new implementQueue();

        System.out.println(queue.isEmpty());
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);
        queue.enqueue(15);
        queue.enqueue(16);
        queue.enqueue(17);

        queue.dequeue(); //remove from frunt
        System.out.println(queue.peek() );
        queue.diplay();













    }
}
