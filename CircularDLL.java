public class CircularDLL {
    Node head;
    Node last;

    class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            data=d;
            next=null;
            prev=null;
        }
    }

    public void AddFirst(int new_data){
        Node new_node=new Node(new_data);

        if(head==null){
            head=new_node;
            last=new_node;
        }

        else{
            new_node.next=head;
            head.prev=new_node;
            head=new_node;
            last.next=head;
            head.prev=last;
        }
    }

    public void AddAfter(int prev_data,int new_data){
        Node new_node = new Node(new_data);
        Node temp=head;
        while(temp.data!=prev_data){
            temp=temp.next;
        }
        new_node.next=temp.next;
        new_node.prev=temp;
        temp.next.prev=new_node;
        temp.next=new_node;
        
    }

    public void DeleteNode(int data){

        Node temp=head;
        while(temp.data!=data){
            temp=temp.next;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        temp.next=null;
        temp.prev=null;

    }


    public void display()
    {
        System.out.println();
        Node node = head;
        //as linked list will end when Node reaches Null
        while(node!=null)
        {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularDLL cdll=new CircularDLL();
        cdll.AddFirst(6);
        cdll.AddFirst(7);
        cdll.AddFirst(8);
        cdll.AddFirst(9);
        cdll.AddAfter(9, 10);
        cdll.DeleteNode(8);
        cdll.display();
    }
    
}
