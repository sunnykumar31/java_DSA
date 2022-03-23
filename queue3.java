class Node9{
    int data;
    Node9 next;
    Node9(int data){
        this.data=data;
    }
}
public class queue3 {
    Node9 front;
    Node9 rear;
    boolean IsEmpty(){
        if(front==null){
            return true;
        }
        else{
            return false;
        }
    }
    public void insertfront(int data){
        Node9 n=new Node9(data);
        if(IsEmpty()){
            front=n;
            rear=n;
        }
        else{
            n.next=front;
            front=n; 
        }
    }
    public void insertrear(int data){
        Node9 n=new Node9(data);
        if(IsEmpty()){
            rear=n;
            front=n;
        }
        else{
            rear.next=n;
            rear=n;
        }
    }
    int deletefront(){
        if(IsEmpty()){
            System.out.println("empty");
            return -1;
        }
        else{
              int x=front.data;
              front=front.next;
              return x;
        }
    }
    int deleterear(){
        if(IsEmpty()){
            System.out.println("empty");
            return -1;
        }
        else{
              int x=rear.data;
              front=front.next;
              return x;
        }
    }
    public void print(){
        
    }
    public static void main(String args[]){
        queue3 obj=new queue3();
        obj.insertfront(30);
        obj.insertrear(20);
        
    }
}
