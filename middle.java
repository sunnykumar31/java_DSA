
import java.util.Scanner;
class node2{
    int data;
    node2 next;
    node2(int data){
        this.data=data;
        this.next=null;
    }
}
public class middle {
    node2 head;
    int count(){
        node2 temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    public void insert(int data){
        node2 n=new node2(data);
        if(head==null){
            head=n;
        }
        else{
            node2 temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    public void print(){
        node2 temp=head;
        int c=1;
        if(head==null){
            System.out.println("head is null");
        }
        else if(count()==1){
            System.out.println(temp.data);
        }
        else if(count()%2==0){
            while(temp!=null){
                if(c==count()/2){
                    break;
                }
                c++;
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
        else{
            while(temp!=null){
                if(c==(count()/2)+1){
                    break;
                }
                c++;
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }
    public static void main(String args[]){
        middle obj=new middle();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of element");
        int n=sc.nextInt();
        System.out.println("enter the element");
        for(int i=0;i<n;i++){
            obj.insert(sc.nextInt());
        }
        System.out.println("print middle element");
        obj.print();
    }
}


