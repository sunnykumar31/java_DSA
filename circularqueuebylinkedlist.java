class Node12{
    int data;
    Node12 next;
    Node12(int data){
        this.data=data;
    }
}
public class circularqueuebylinkedlist {
    Node12 front;
    Node12 rear;
    public void enqueue(int data){
        Node12 n=new Node12(data);
        if(front==null){
            front=n;
            rear=n;
            rear.next=front;
        }
        else{
            rear.next=n;
            rear=n;
            rear.next=front;
        }
        
    }
    public void dequeue(){
        if(front==null){
            System.out.println("queue underflow");
            
        }
        else{
            int ele=front.data;
            front=front.next;
            rear.next=front;
            
        }
    }
    public void print(){
        Node12 temp=front;
        while(temp.next!=front){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.print(temp.data+"<->");
        
    }
    public int front(){
        if(front==null){
            System.out.println("queue underflow");
            return -1;
        }
        else{
            int ele=front.data;
            return ele;
        }
    }
    public int rear(){
        if(front==null){
            System.out.println("queue underflow");
            return -1;
        }
        else{
            int ele=rear.data;
            return ele;
        }
    }
    public static void main(String args[]){
        circularqueuebylinkedlist obj=new circularqueuebylinkedlist();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.print();
        obj.dequeue();
        System.out.println(obj.front());
        System.out.println(obj.rear());
        obj.print();
                        
    }
}
