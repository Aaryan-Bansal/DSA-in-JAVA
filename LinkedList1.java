public class LinkedList1 {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public void AddFirst(int new_data){
        Node new_node= new Node(new_data);

        new_node.next=head;
        head=new_node;
    }

    public void AddLast(int new_data){
        Node new_node= new Node(new_data);
        new_node.next=null;

        
        if(head==null){
            head=new_node;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
    }

    public void DeleteFirst(){

        if(head==null){
            System.out.println("Empty Error");
        }

        else if(head.next==null){
            head=null;
            System.out.println("Empty ");
        }

        else{
            Node temp=head;
            head=temp.next;
            temp.next=null;
        }
    }

    public void DeleteLast(){

        if(head==null){
            System.out.println("Empty Error");
        }

        else if(head.next==null){
            head=null;
            System.out.println("Empty ");
        }
        else{
            Node last=head;
        
            while(last.next.next!=null){
                last=last.next;
            }
            last.next=null;

        }
        
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
        
        LinkedList1 ll=new LinkedList1();

        ll.AddFirst(7);
        ll.AddFirst(8);
        ll.display();
        ll.DeleteLast();
        ll.display();
        
    }
    
}
