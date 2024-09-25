package pushpak40ImplementStackQueue;

public class implementQueue {
    Node front;
    Node reare;
    public implementQueue(){
        this.front=null;
        this.reare =null;

    }
    public boolean isEmpty(){
        return front == null;
    }

    public void enqueue(int data){
        Node newnode = new Node(data);
        if (reare ==null){
            front =reare =newnode;
        }else {
            reare.next = newnode;
            reare=newnode;
        }
    }
    public void diplay(){
        if(isEmpty()){
            System.out.println("emplty");
        }
        Node curr = front;
        while (curr != null){
            System.out.print(curr.data+" ");
            curr =curr.next;
        }
        System.out.println();
    }
    public int dequeue(){
        int dequedata  =front.data;
        front =front.next;
        return dequedata;

    }
    public int peek(){
        return front.data;
    }




}
