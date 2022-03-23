import java.util.Scanner;
public class stack1 {
    static final int max=5;
    int arr[]=new int[max];
    int top;
    stack1(){
        top=-1;
    }
    boolean isempty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isfull(){
        if(top>=(max-1)){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(int x){
        if(isfull()){
            System.out.println("stack overflow");
        }
        else{
            top++;
            arr[top]=x;
        }
    }
    public int pop(){
        if(isempty()){
            System.out.println("stack underflow");
            return -1;
        }
        else{
            int x=arr[top];
            top--;
            return x;
        }
    }
    public int peek(){
        if(isempty()){
            System.out.println("stack underflow");
            return -1;
        }
        else{
            int x=arr[top];
            return x;
        }
    }
    public void print(){
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        stack1 obj=new stack1();
        Scanner sc=new Scanner(System.in);
        obj.push(sc.nextInt());
//        obj.push(sc.nextInt());
//        obj.push(sc.nextInt());
//        obj.push(sc.nextInt());
//        obj.push(sc.nextInt());
//        obj.push(sc.nextInt());
//        obj.print();
//        obj.pop();
//        System.out.println();
//        obj.print();
//        obj.peek();
//        System.out.println();
//        obj.print();
//        int number=sc.nextInt();
//        int copynumber=number;
//        int n=0;
//        while(number>0){
//            obj.push(number%10);
//            number/=10;
//            n++;
//        }
//        int i=1;
//        int rem=0;
//        int sum=0;
//        while(n>0){
//            rem=(obj.pop())*i;
//            sum+=rem;
//            i*=10;
//            n--;
//            System.out.println(sum);
//        }
//        if(sum==copynumber){
//            System.out.println("pallindrome number");
//        }
//        else{
//            System.out.println("not pallindrome number");
//        }
    }
}
