import java.util.Scanner;
class Node11{
    char str;
    Node11 next;
    Node11(char str){
        this.str=str;
    }
}
public class stringreversebystack {
    Node11 top;
    
    boolean IsEmpty(){
        if(top==null){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(char str){
        Node11 n=new Node11(str);
        n.next=top;
            top=n;
//        if(IsEmpty()){
//            top=n;
//        }
//        else{
//            n.next=top;
//            top=n;
//        }
    }
    public char pop(){
        if(IsEmpty()){
            System.out.println("stack underflow");
            return -1;
        }
        else{
            char str1=top.str;
            top=top.next;
            return str1;
        }
        
    }
    public char peek(){
        if(IsEmpty()){
            System.out.println("stack underflow");
            return -1;
        }
        else{
            char str1=top.str;
            return str1;
        }
    }
    public static void main(String args[]){
        stringreversebystack obj=new stringreversebystack();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.next();
        int l=str.length();
        for(int i=0;i<l;i++){
            obj.push(str.charAt(i));
        }
//        for(int i=0;i<l;i++){
//            System.out.print(obj.pop());
//        }
        int f=0;
        for(int i=0;i<l;i++){
            if((obj.pop())==str.charAt(i)){
            }
            else{
                f=1;
                System.out.println("number is not pallindrome");
                return;
            }
        }
        if(f==0){
            System.out.println("number is pallindrome");
        }
        
    }
            
}
