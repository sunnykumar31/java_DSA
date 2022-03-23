import java.util.*;
class Node2{
    int data;
    Node2 next;
    Node2(int data){
        this.data=data;
    }
}
public class middle2 {
    Node2 head;
    public void insert(int data){
        Node2 newest=new Node2(data);
        Node2 temp=head;
        if(head==null){
            head=newest;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newest;
        }
    }
    public void printmiddle(){
        Node2 temp1=head;
        Node2 temp2=head;
        if(head==null){
            System.out.println("head is null");
        }
        else if(head.next==null){
            System.out.println(temp1.data);
        }        
        else{
            while(temp2!=null&&temp2.next!=null){
                temp1=temp1.next;
                temp2=temp2.next.next;
            }
            System.out.println(temp1.data);
        }
    }
    public static void main(String args[]){
        middle2 obj=new middle2();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of element");
        int num=sc.nextInt();
        System.out.println("enter the element");
        for(int i=0;i<num;i++){
            obj.insert(sc.nextInt());
        }
        System.out.println("middle element is:");
        obj.printmiddle();
    }
}
