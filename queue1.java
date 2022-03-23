import java.util.Scanner;
class Node7{
    int data;
    Node7 next;
    Node7(int data){
        this.data=data;
    }
}
public class queue1 {
    Node7 front;
    Node7 rear;
    boolean isEmpty(){
        if(front==null){
            return true;
        }
        else{
            return false;
        }
    }
    public void enqueue(int data){
        Node7 n=new Node7(data);
        if(isEmpty()){
            front=n;
            rear=n;
        }
        else{
            rear.next=n;
            rear=n;
        }
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("queue underflow");
            return -1;
        }
        else{
            int x=front.data;
            front=front.next;
            return x;
        }
    }
    public int front(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        else{
            int x=front.data;
            return x;
        }
    }
    public int rear(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        else{
            int x=rear.data;
            return x;
        }
    }
    public static void main(String arg[]){
        queue1 obj=new queue1();
        System.out.println(obj.dequeue());
        obj.enqueue(10);
        obj.enqueue(20);
        System.out.println(obj.dequeue());
        obj.enqueue(30);
        System.out.println(obj.front());
        obj.enqueue(40);
        System.out.println(obj.rear());
        
        
    }
}
