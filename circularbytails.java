import java.util.Scanner;
class Node8{
    int data;
    Node8 next;
    Node8(int data){
        this.data=data;
    }
}
public class circularbytails {
    Node8 head;
    Node8 tail;
    public void insert(int data){
        Node8 n=new Node8(data);
        if(tail==null){
            tail=n;
            head=n;
            n.next=head;
        }
        else{
            tail.next=n;
            tail=n;
            n.next=head;
        }
    }
    public void insertatend(int data){
        Node8 n=new Node8(data);
        if(tail==null){
            tail=n;
            head=n;
            n.next=head;
        }
        else{
            tail.next=n;
            tail=n;
            n.next=head;
        }
    }
    public void print(){
        Node8 temp=head;
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
    public static void main(String arg[]){
        circularbytails obj=new circularbytails();
        Scanner sc=new Scanner(System.in);
        System.out.println("etr no of ele");
        int num=sc.nextInt();
        System.out.println("entr ele");
        for(int i=0;i<num;i++){
            obj.insert(sc.nextInt());
        }
        obj.print();
        System.out.println();
//        obj.insertatend(sc.nextInt());
//        obj.dltatlast();
        obj.print();
        
        
    }
    
}
