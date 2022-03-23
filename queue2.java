
public class queue2 {
    static final int max=5;
    int arr[]=new int[max];
    static int front,rear;
    queue2(){
        front=0;
        rear=0;
        
    }
    boolean IsEmpty(){
        if(front==rear){
            return true;
        }
        else{
            return false;
        }
    }  
    boolean IsFull(){
        if(rear>=(max)){
            return true;
        }
        else{
            return false;
        }
    }
    public void enqueue(int data){
        if(IsFull()){
            System.out.println("queue overflow");
        }
        else{
//            rear++;
            arr[rear]=data;
            rear++;
        }
    }
    public int dequeue(){
        if(IsEmpty()){
            System.out.println("queue underflow");
            return -1;
        }
        else{
            int x=arr[front];
            for(int i=0;i<rear-1;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return x;
        }
    }
    public int peek(){
        if(IsEmpty()){
            System.out.println("queue underflow");
            return -1;
        }
        else{
            int x=arr[front];
            return x;
            
        }
    }
    public int rear(){
        if(IsEmpty()){
            System.out.println("queue underflow");
            return -1;
        }
        else{
            int x=arr[rear-1];
            return x;
            
        }
    }
    public static void main(String args[]){
        queue2 obj=new queue2();
        obj.dequeue();
        obj.enqueue(50);
        obj.enqueue(60);
        obj.dequeue();
//        obj.enqueue(70);
//        obj.enqueue(50);
//        obj.enqueue(60);
////        obj.enqueue(60);
//        System.out.println(obj.peek());
//        obj.peek();
//        obj.rear();
        
    }
}
