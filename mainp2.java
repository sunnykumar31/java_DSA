class Node1{
    String data;
    Node1 next;
    Node1(String data){
        this.data=data;
        next=null;
    }
}
public class mainp2 {
    Node1 head;
    public void print(){
        Node1 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void first(String str){
        Node1 n=new Node1(str);
        if(head==null){
            head=n;
        }
        else{
            n.next=head;
            head=n;
        }
    }
    public void last(String str){
        Node1 n=new Node1(str);
        Node1 temp=head;
        if(head==null){
            head=n;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    int size(){
        Node1 temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public void inbetween(int pos,String str){
        Node1 n=new Node1(str);
        
        if(head==null){
            if(pos!=1){
                System.out.println("position invalid");
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
            else if(size()+1<pos){
                System.out.println("positio invalid");
            }
            else{
                Node1 temp=head;
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
    
    public static void main(String arg[]){
        mainp2 obj=new mainp2();
        Node1 n=new Node1("this");
        obj.head=n;
        Node1 n1=new Node1("is");
        n.next=n1;
        Node1 n2=new Node1("Gla");
        n1.next=n2;
        obj.print();
        System.out.println(obj.size());
        obj.first("yes!");
        obj.print();
        System.out.println(obj.size());
        obj.last("mathura");
        obj.print();
        System.out.println(obj.size());
        obj.inbetween(5, "university");
        obj.print();
        System.out.println(obj.size());
        
        
    }
    
}
