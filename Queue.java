public class Queue {
    Node front;
    Node rear;

    class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            this.data = d;
            this.next = null;
            this.prev = null;
        }
    }

    public void push(int new_data){
        Node new_node = new Node(new_data);
        if(front==null){
            front = new_node;
            rear  = new_node;
        }
        else{
            new_node.next=front;
            front = new_node;
        }
    }

    public void pop(){
        if(front==null){
            System.out.println("Empty Queue Error");
        }

        else if(front.next==null){
            
        }
    }
}
