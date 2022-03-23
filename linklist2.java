import java.util.Scanner;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class linklist2 {
    static node head;
    int count(){
        node temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    public void insert(int data){
        node n=new node(data);
        if(head==null){
            head=n;
        }
        else{
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    public void firstinsert(int x){
        node n=new node(x);
        n.next=head;
        head=n;
        
    }
    public void lastinsert(int x){
        node n=new node(x);
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
    }
    public void insertinbt(int pos,int x){
        node n=new node(x);
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
            else if(pos>count()+1){
                System.out.println("postion invalid");
            }
            else{
                node temp=head;
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
    public void dltatfirst(){
        if(head==null){
            return;
        }
        else{
            head=head.next;
        }
    }
    public void dltinbt(int pos){
        if(head==null){
            return;
        }
        else if(head.next==null){
            if(pos==1){
                head=null;
            }
            else{
               System.out.println("invalid position"); 
            }
            
        }
        else if(pos>count()){
            System.out.println("invalid position");
        }
        else if(pos==1){
            head=head.next;
        }
        else{
            int c=1;
            node temp=head;
            while(temp!=null){
                if(c==pos-1){
                    break;
                }
                c++;
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        
    }
    public void dltatlast(){
        if(head==null){
            return;
        }
        else if(head.next==null){
            head=null;
        }
        else{
            node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
    }
    public void dltbydata(int data){
        if(head==null){
            return;
        }
        else if(head.next==null){
            if(head.data==data){
                head=null;
            }
            else{
                System.out.println("invalid data");
            }
        }
        
        else{
            node temp=head;
            if(head.data==data){
                head=head.next;
            }
            else{
                int f=0;
                while(temp!=null){
                    if(temp.next.data==data){
                        f=1;
                        break;     
                    }
                    temp=temp.next;
                }
                if(f==1){
                    temp.next=temp.next.next;
                }
                else{
                  System.out.println("invalid data");  
                }
            }
        }
    }
    public void searchnodebydata(int data){
        if(head==null){
            System.out.println("empty");
        }
        else{
            node temp=head;
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
    public void reversebyrecursion(node temp){
        if(temp==null){
            return;
        }
        else{
            reversebyrecursion(temp.next);
            System.out.print(temp.data+" ");
        }
    }
    public void printbyrecursion(node temp){
        if(temp==null){
            return;
        }
        else{
            System.out.print(temp.data+" ");
            printbyrecursion(temp.next);
        }
    }
    static int rcount=0;
    public int countbyrecursion(node temp){
        if(temp==null){
            return rcount;
        }
        else {
            rcount++;
            return countbyrecursion(temp.next);
        }
    }
    public void print(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        
    }
    public static void main(String args[]){
        linklist2 obj=new linklist2();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of element");
        int n=sc.nextInt();
        System.out.println("enter the element of linkedlist");
        for(int i=0;i<n;i++){
            obj.insert(sc.nextInt());
        }
        obj.print();
        System.out.println();
//        obj.firstinsert(40);
//        obj.print();
//        obj.lastinsert(50);
//        obj.print();
//        obj.dltatfirst();
//        obj.print();
//        obj.dltatlast();
//        System.out.println("enter the position ");
//        obj.dltinbt(sc.nextInt());
//        obj.dltbydata(sc.nextInt());
//        obj.searchnodebydata(sc.nextInt());
        obj.reversebyrecursion(head);
        System.out.println();
        obj.printbyrecursion(head);
        System.out.println();
        System.out.println(obj.countbyrecursion(head));
//        obj.print();
        
    }
}
