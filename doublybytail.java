
import java.util.Scanner;

class Node10{
    int data;
    Node10 next;
    Node10 prev;
    Node10(int data){
        this.data=data;
    }
}
public class doublybytail {
    Node10 head;
    Node10 tail;
    public void insert(int data){
        Node10 n=new Node10(data);
        if(tail==null){
            tail=n;
            head=n;
        }
        else{
            tail.next=n;
            n.prev=tail;
            tail=n;
        }
    }
    public void insertatbeg(int data){
        Node10 n=new Node10(data);
        if(tail==null){
            tail=n;
            head=n;
        }
        else{
            n.next=head;
            head.prev=n;
            head=n;
        }
    }
    public void insertatlast(int data){
        Node10 n=new Node10(data);
        if(tail==null){
            tail=n;
            head=n;
        }
        else{
            tail.next=n;
            n.prev=tail;
            tail=n;
        }
    }
    public void insertatanypos(int pos,int data){
        Node10 n=new Node10(data);
        if(tail==null){
            if(pos!=1){
                System.out.println("invalid pos");
            }
            else{
                tail=n;
                head=n;
            }
        }
        else if(pos>count()+1){
            System.out.println("invalid pos");
        }
        else{
            if(pos==1){
                n.next=head;
                head.prev=n;
                head=n;
            }
            else{
                Node10 temp=head;
                int c=1;
                while(temp!=null){
                    if(c==pos-1){
                        break;
                    }
                    c++;
                    temp=temp.next;
                }
                if(temp.next==null){
                    n.prev=temp;
                    temp.next=n;
                }
                else{
                    n.prev=temp;
                    n.next=temp.next;
                    temp.next.prev=n;
                    temp.next=n;
                }
                    
                
            }
        }
    }
    public void dltatbeg(){
        if(tail==null){
            System.out.println("linkedlist is empty");
        }
        else if(head.next==null){
            tail=null;
            head=null;
        }
        else{
            head.next.prev=null;
            head=head.next;
        }
    }
    public void dltatend(){
        if(tail==null){
            System.out.println("linkedlist is empty");
        }
        else if(head.next==null){
            head=null;
        }
        else if(head.next.next==null){
            head.next=null;
        }
        else{
            tail.prev.next=null;
            tail=tail.prev;
        }
    }
    public void dltatanypos(int pos){
        if(tail==null){
            System.out.println("empty linklist");
        }
        else if(head.next==null){
            if(pos==1){
                head=null;
                tail=null;
            }
            else{
                System.out.println("invalid pos");
            }
        }
        else if(pos>count()){
            System.out.println("invalid pos");
        }
        else{
            Node10 temp=head;
            if(pos==1){
                head.next.prev=null;
                head=head.next;
            }

            else{
                int c=1;
                while(temp!=null){
                    if(c==pos-1){
                        break;
                    }
                    c++;
                    temp=temp.next;
                }
                if(temp.next.next==null){
                    temp.next=null;
                }
                else{
                    temp.next.next.prev=temp;
                    temp.next=temp.next.next;
                }
            }
        }
    }
    int count(){
        Node10 temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    public void print(){
        Node10 temp=head;
        if(head==null){
            System.out.println("empty");
        }
        else{
            while(temp!=null){
                System.out.print(temp.data+"<->");
                temp=temp.next;
            }
        }
    }
    public static void main(String args[]){
        doublybytail obj=new doublybytail();
        Scanner sc=new Scanner(System.in);
        System.out.println("etr no of ele");
        int num=sc.nextInt();
        System.out.println("entr ele");
        for(int i=0;i<num;i++){
            obj.insert(sc.nextInt());
        }
//        obj.insert(10);
//        obj.insert(20);
        
        obj.print();
        System.out.println();
//        obj.insertatbeg(sc.nextInt());
//        obj.insertatlast(sc.nextInt());
//        obj.insertatanypos(sc.nextInt(),sc.nextInt());
//        obj.dltatbeg();
        obj.dltatend();
        obj.dltatend();
//        obj.dltatanypos(sc.nextInt());
//        obj.dltatanydata(sc.nextInt());
//        obj.searchnodebydata(sc.nextInt());
        obj.print();
        System.out.println();
    }
}
