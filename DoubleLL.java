public class DoubleLL {
    Node head;

    class Node{
        int data;
        Node next;
        Node prev;

        Node(int d){
            data = d;
            next = null;
            prev = null;
        }
    }

    public void AddFirst(int new_data){
        Node new_node= new Node(new_data);
        new_node.next = head;
        new_node.prev = null;

        if (head != null){
            head.prev = new_node;
        }
        

        head=new_node;

    }

    public void AddLast(int new_data){
        Node new_node=new Node(new_data);

        if(head==null){
            head=new_node;
        }

        Node last=head;
                
        while(last.next!=null){
            last=last.next;
        }

        last.next=new_node;
        new_node.prev=last;
        new_node.next=null;
        last=new_node;          

    }

    public void DeleteFirst(){
        
        if(head==null){
            System.out.println("Empty Error");
        }

        else if(head.next==null){
            head=null;
            System.out.println("Empty List");
    
        }

        else{
            
            Node temp=head;
            head=temp.next;
            temp.next=null;
            head.prev=null;   

        } 
    }

    public void DeleteLast(){
        if(head==null){
            System.out.println("Empty Error");
        }

        else if(head.next==null){
            head=null;
            System.out.println("Empty List");
        }
        
        else{
            Node last=head.next;
            Node second_last=head;
            while(last.next!=null){
                last=last.next;
                second_last=second_last.next;
            }

            last.prev=null;
            second_last.next=null;
            last=second_last;

        }
    }

    public void AddAfter(int prev_data,int new_data){
        Node new_node = new Node(new_data);
        
        
        Node temp=head;
        while(temp.data!=prev_data){
            temp=temp.next;
        }
        if(temp.next!=null){
            temp.next.prev=new_node;
        }
                
        new_node.next=temp.next;
        temp.next=new_node;
        new_node.prev=temp;

    }


    /*public void AddAfter(int prev_data, int new_data) {
        Node new_node = new Node(new_data);
    
        Node temp = head;
        while (temp != null && temp.data != prev_data) {
            temp = temp.next;
        }
    
        if (temp == null) {
            // Node with prev_data not found, handle this case (throw exception, log, etc.)
            System.out.println("Node with prev_data not found");
            return;
        }
    
        new_node.next = temp.next;
    
        // Check if temp.next is not null to avoid NullPointerException
        if (temp.next != null) {
            temp.next.prev = new_node;
        }
    
        temp.next = new_node;
        new_node.prev = temp;
    }*/
    
    public void AddBefore(int next_data,int new_data){
        Node new_node = new Node(new_data);
        
        
        Node temp=head;
        while(temp.data!=next_data){
            temp=temp.next;
        }
        
        temp.prev.next=new_node;
        new_node.next=temp;
        new_node.prev=temp.prev;
        temp.prev=new_node;

    }

    public void display(){
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
        
        DoubleLL ll=new DoubleLL();

        ll.AddFirst(7);
        ll.AddFirst(8);
        ll.display();
        ll.AddLast(9);
        ll.display();
        ll.DeleteFirst();
        ll.display();
        ll.DeleteLast();
        ll.display();
        ll.DeleteLast();
        ll.display();
        ll.AddFirst(7);
        ll.AddAfter(7,15 );
        ll.display();
        ll.AddBefore(15, 12);
        ll.display();
        
    }


}
