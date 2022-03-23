
public class circularqueue {
    static int front,rear,max=3;
    int queue[]=new int[max];
    circularqueue(){
        front=-1;
        rear=-1;
    }
    public void enqueue(int data){
        if((front==-1) && (rear==-1)){
            front=0;
            rear=0;
            queue[rear]=data;
            System.out.println("inserted data is "+data);
        }
        else if(front==(rear+1)%max){
            System.out.println("queue overflow");
        }
        else{
            rear=(rear+1)%max;
            queue[rear]=data;
            System.out.println("inserted data is "+data);
        }
    }
    public void dequeue(){
        if((front==-1) &&(rear==-1)){
            System.out.println("queue underflow");
        }
        else if(front==rear){
            System.out.println("the dequeued element is "+queue[front]);
            front=rear=-1;
        }
        else{
            int element=queue[front];
            front=(front+1)%max;
            System.out.println("dequeued element "+element);
        }
    }
    public void print(){
        int i=front;
        if((front==-1) && (rear==-1)){
            System.out.println("queue is empty");
        }
        else{
            while(i!=rear){
                System.out.print(queue[i]+" ");
                i=(i+1)%max;
            }
            System.out.print(queue[i]+" ");
        }
    }
    public static void main(String args[]){
        circularqueue obj=new circularqueue();
        obj.enqueue(10);
//        obj.print();
        obj.enqueue(20);
//        obj.print();
        obj.enqueue(30);
//        obj.print();
        obj.enqueue(40);
        obj.print();
        obj.dequeue();
        obj.print();
        obj.dequeue();
        obj.print();
        obj.dequeue();
        obj.print();
        obj.dequeue();   
    }
}
          