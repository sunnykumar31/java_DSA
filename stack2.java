import java.util.Scanner;
class Node6{
    int data;
    Node6 next;
    Node6(int data){
        this.data=data;
    }
}
public class stack2 {
    Node6 top;
    boolean isEmpty(){
        if(top==null){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(int data){
        Node6 n=new Node6(data);
        n.next=top;
        top=n;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack underflow");
            return -1;
        }
        else{
            int x=top.data;
            top=top.next;
            return x;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("stack underflow");
            return -1;
        }
        else{
            int x=top.data;
            return x;
        }
    }
    public static void main(String args[]){
        stack2 s=new stack2();
        System.out.println(s.pop());
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        s.push(30);
        System.out.println(s.peek());
        s.push(40);
    }
}
