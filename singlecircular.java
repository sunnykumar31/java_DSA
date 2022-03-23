import java.util.Scanner;
class Node3{
    int data;
    Node3 next;
}
public class singlecircular {
    Node3 head;
    public void insert(int data){
        Node3 n=new Node3();
        n.data=data;
        if(head==null){
            head=n;
            n.next=head;
        }
        else{

            Node3 temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=n;
            n.next=head;
        }
        
    }
    public void insertatbeg(int data){
        Node3 n=new Node3();
        n.data=data;
        if(head==null){
            head=n;
            n.next=n;
        }
        else{
            Node3 temp=head;
            n.next=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=n;
            head=n;
            
        }
    }
    public void insertatend(int data){
        Node3 n=new Node3();
        n.data=data;
        if(head==null){
            head=n;
            n.next=n;
        }
        else{
            Node3 temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=n;
            n.next=head;
            
        }
    }
    public void insertatanypos(int data,int pos){
        Node3 n=new Node3();
        n.data=data;
        if(head==null){
            if(pos!=1){
                System.out.println("invalid position");
            }
            else{
                head=n;
                n.next=head;
            }
        }
        else if(pos==1){
            Node3 temp=head;
            n.next=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=n;
            head=n;
        }
        else if(pos>count()+1){
            System.out.println("invalid position");
        }
        else{
            Node3 temp=head;
            int c=1;
            while(temp.next!=head){
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
    public void dltatbeg(){
        if(head==null){
            System.out.println("empty linkedlist");
        }
        else if(head.next==head){
            head=null;
        }
        else{
            Node3 temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=head.next;
            head=head.next;
        }
    }
    public void dltatend(){
        if(head==null){
            System.out.println("empty linkedlist");
        }
        else if(head.next==head){
            head=null;
        }
        else{
            Node3 temp=head;
            while(temp.next.next!=head){
                temp=temp.next;
            }
            temp.next=head;
        }
    
    }
    public void dltatanypos(int pos){
        if(head==null){
                if(pos==0){
                    System.out.println("empty");
                }
                else{
                    System.out.println("invalid pos");
                }
            
        }
        else if(head.next==head){
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
            Node3 temp=head;
            if(pos==1){
                while(temp.next!=head){
                temp=temp.next;
                }
            temp.next=head.next;
            head=head.next;
            }
            else{
                int c=1;
                while(temp.next!=head){
                    if(c==pos-1){
                        break;
                    }
                    c++;
                    temp=temp.next;
                }
                temp.next=temp.next.next;
            }
        }
    }
    public void dltbydata(int data){
       if(head==null){
           System.out.println("empty");
       }
       else if(head.next==head){
           if(head.data==data){
               head=null;
           }
           else{
               System.out.println("invalid data");
           }
       }
       else if(head.data==data){
           Node3 temp=head;
           while(temp.next!=head){
               temp=temp.next;
           }
           temp.next=head.next;
           head=head.next;
       }
       else{
           Node3 temp=head;
           int f=0;
           while(temp.next!=head){
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
    public void searchnodebydata(int data){
        if(head==null){
            System.out.println("empty");
        }
        else if(head.next==head){
            if(head.data==data){
                System.out.println("data found");
            }
            else{
                System.out.println("invalid data");
            }
        }
        else{
            Node3 temp=head;
            int f=0;
            while(temp.next!=head){
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
    int count(){
        Node3 temp=head;
        int c=0;
        if(head==null){
            return c;
        }
        else{
            while(temp.next!=head){
                c++;
                temp=temp.next;
            }
            c++;
            return c;
        }
    }
    public void print(){
        Node3 temp=head;
        if(head==null){
            return;
        }
        else{
            while(temp.next!=head){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.print(temp.data+"->");
        }
    }
    public static void main(String args[]){
        singlecircular obj=new singlecircular();
        Scanner sc=new Scanner(System.in);
        System.out.println("etr no of ele");
        int num=sc.nextInt();
        System.out.println("entr ele");
        for(int i=0;i<num;i++){
            obj.insert(sc.nextInt());
        }
        obj.print();
        System.out.println();
//        obj.insertatbeg(40);
//        obj.print();
//        obj.insertatend(60);
//        
//        obj.print();
//        obj.insertatanypos(70,3);
//        obj.dltatbeg();
//        obj.dltatend();
//        obj.dltatanypos(sc.nextInt());
        obj.dltbydata(sc.nextInt());
        obj.print();
    }
    
            
}
