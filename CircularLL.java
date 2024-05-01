public class CircularLL {
    Node head;
    Node last;

    class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }

    public void AddFirst(int new_data){
        Node new_node=new Node(new_data);
        
        if(head==null){
            head=new_node;
            last=new_node;
        }

        else{
            new_node.next = head;
            head=new_node;
            last.next = head;
        }
    }

    public void AddAfter(int prev_data,int new_data){
        Node new_node=new Node(new_data);
        Node temp=head;
        while(temp.data!=prev_data){
            temp=temp.next;
        }
        new_node.next=temp.next;
        temp.next=new_node;

    }

    public void DeleteFirst(){
        Node temp=head;
        last.next=temp.next;
        head=temp.next;
        temp.next=null;
    }
    
    public void DeleteNode(int data){
        Node temp=head;
        while(temp.next.data!=data){
            temp=temp.next;
        }
        temp.next=temp.next.next;
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
        
        CircularLL cll=new CircularLL();

        cll.AddFirst(7);
        cll.AddFirst(8);
        cll.AddFirst(10);
        
        cll.AddAfter(10, 9);
        cll.DeleteNode(9);
        cll.display();

        
        //ll.display();
        //ll.DeleteLast();
        //ll.display();
        
    }
}
