import java.io.*;
import java.util.*;
// SUNNY KUMAR ,SECTION:"O",ROLL NO.:23
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Solution {
    Node head;
    public void insert(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
    
    }
    public int count(){
        Node temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    public void insertatpos(int data,int pos){
        Node n=new Node(data);
        if(head==null){
            if(pos!=1){}
            else{
                head=n;
            }
        }
        else{
            if(pos>count()+1){}
            else if(pos==1){
                n.next=head;
                head=n;
            }
            else{
                Node temp=head;
                int c=1;
                while(temp!=null){
                    if(pos-1==c){
                        break;
                    }
                    temp=temp.next;
                    c++;
                }
                n.next=temp.next;
                temp.next=n;
                
            }
        }
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Solution obj=new Solution();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            obj.insert(sc.nextInt());
        }
        int data=sc.nextInt();
        int pos=sc.nextInt();
        obj.insertatpos(data,pos);
        obj.print();
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}