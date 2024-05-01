public class Stack {
    Node top;
    
    class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next=top;
        top=new_node;
    }

    public void pop() {
        if(top==null){
            System.out.println("Empty Stack Error");
        }
        else if(top.next==null){
            top=null;
            System.out.println("Empty Stack");
        }
        
        else{
        Node temp=top;
        top=top.next;
        temp.next=null;
        }
    }

    public void top(){
        System.out.println(top.data);
    }
    
    public boolean isEmpty(){
        if(top==null){
            System.out.println("yes");
            return true;
        }
        else{
            System.out.println("no");
            return false;
        }
    }

    public int size(){
        Node temp=top;
        int size=0;

        while(temp.next!=null){
            size++;
            temp=temp.next;
        }

        return size;
    }

    public void display(){


        if(top==null){
            System.out.println("Null");
        }
        else{
            Node temp = top;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
            

        }
        
    }

    public static void main(String[] args) {
        Stack stack1 = new Stack();
        stack1.pop();
        stack1.display();
        stack1.isEmpty();
        stack1.push(9);
        stack1.display();
        stack1.push(8);
        stack1.push(7);
        stack1.push(6);
        stack1.pop();
        stack1.display();
        stack1.push(5);
        stack1.top();
    }
    
}
