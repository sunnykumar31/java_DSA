class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class main {
    Node head;
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void firstinsert(int x){
        Node n=new Node(x);
        n.next=head;
        head=n;
        
    }
    public void lastinsert(int x){
        Node n=new Node(x);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
    }
    public int size(){
        Node temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
        
        
    }
    public void insertinbt(int pos,int x){
        Node n=new Node(x);
        if(head==null){
            if(pos!=1){
                System.out.println("invalid position");
            }
            else{
                head=n;
            }
        }
        else{
            if(pos==1){
                n.next=head;
                head=n;
            }
            else if(pos>size()+1){
                System.out.println("postion invalid");
            }
            else{
                Node temp=head;
                int c=1;
                while(temp!=null){
                    if(c==pos-1){
                        break;
                    }
                    c++;
                    temp=temp.next;
                }
                n.next=temp.next;
                temp.next=n;
                
            } 
        }
    }
    
    public static void main(String args[]){
        main obj=new main();
        Node n1=new Node(10);
        obj.head=n1;
        Node n2=new Node(20);
        n1.next=n2;
        Node n3=new Node(30);
        n2.next=n3;
        obj.print();
        obj.firstinsert(40);
        obj.print();
        obj.lastinsert(50);
        obj.print();
        System.out.println("\n"+obj.size());
        obj.insertinbt(3,60);
        obj.print();
        System.out.println("\n"+obj.size());
        
    }
}
