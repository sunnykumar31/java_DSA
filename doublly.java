   import java.util.Scanner;
class Node5{
   int data;
   Node5 next;
   Node5 prev;
   Node5(int data){
       this.data=data;
   }
} 
public class doublly {
    Node5 head;
//    Node5 prev;
    public void insert(int data){
        Node5 n=new Node5(data);
        if(head==null){
            head=n;
        }
        else{
            Node5 temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            n.prev=temp;
            temp.next=n;
            
        }
    }
    public void insertatbeg(int data){
        Node5 n=new Node5(data);
        if(head==null){
            head=n;
        }
        else{
            n.next=head;
            head.prev=n;
            head=n;
            
        }
    }
    public void insertatend(int data){
        Node5 n=new Node5(data);
        if(head==null){
            head=n;
        }
        else{
            Node5 temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            n.prev=temp;
            temp.next=n;              
        }
    }
    public void insertatnypos(int pos,int data){
        Node5 n=new Node5(data);
        if(head==null){
            if(pos!=1){
                System.out.println("invalid pos");
            }
            else{
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
                Node5 temp=head;
                int c=1;
//                if(pos==count()+1){
//                    while(temp.next!=null){
//                        temp=temp.next;
//                    }
//                    n.prev=temp;
//                    temp.next=n;
//                }
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
        if(head==null){
            System.out.println("linkedlist is empty");
        }
        else if(head.next==null){
            head=null;
        }
        else{
            head.next.prev=null;
            head=head.next;
        }
    }
    public void dltatend(){
        if(head==null){
            System.out.println("linkedlist is empty");
        }
        else if(head.next==null){
            head=null;
        }
        else{
            Node5 temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
    }
    public void dltatanypos(int pos){
        if(head==null){
            System.out.println("empty linklist");
        }
        else if(head.next==null){
            if(pos==1){
                head=null;
            }
            else{
                System.out.println("invalid pos");
            }
        }
        else if(pos>count()){
            System.out.println("invalid pos");
        }
        else{
            Node5 temp=head;
            if(pos==1){
                head.next.prev=null;
                head=head.next;
            }
//            else if(pos==count()){
//                while(temp.next.next!=null){
//                    temp=temp.next;
//                }
//                temp.next=null;
//            }
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
    public void dltatanydata(int data){
        if(head==null){
            System.out.println("empty linklist");
        }
        else if(head.next==null){
            if(data==head.data){
                head=null;
            }
            else{
                System.out.println("invalid data");
            }
        }
        else{
            Node5 temp=head;
            if(head.data==data){
                head.next.prev=null;
                head=head.next;
            }
            else{
                int f=0;
                while(temp.next!=null){
                     if(temp.next.data==data){
                         f=1;
                        break;
                    }
                    temp=temp.next;
                    
                }                
                if(temp.next.next==null){
                    temp.next=null;
                }
                else if(f==1){
                    
                    temp.next=temp.next.next;
                    temp.next.prev=temp;
                    
                }
                else{
                    System.out.println("data not founnd");
                }
            }
        }
    }
    public void dltbynode(int node){
        
    }
    int count(){
        Node5 temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    public void searchnodebydata(int data){
        if(head==null){
            System.out.println("empty");
        }
        else{
            Node5 temp=head;
            int f=0;
            while(temp!=null){
               if(temp.data==data){
                   f=1;
                   break;
               } 
               temp=temp.next;
            }
            if(f==1){
                System.out.println("data found");
            }
            else{
                System.out.println("invalid data");
            }
        }
    }
    public void print(){
        Node5 temp=head;
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
        doublly obj=new doublly();
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
//        obj.insertatend(sc.nextInt());
        obj.insertatnypos(sc.nextInt(),sc.nextInt());
//        obj.dltatbeg();
//        obj.dltatend();
//        obj.dltatanypos(sc.nextInt());
//        obj.dltatanydata(sc.nextInt());
//        obj.searchnodebydata(sc.nextInt());
        obj.print();
        System.out.println();
    }
}
