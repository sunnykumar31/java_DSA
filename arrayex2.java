class A{
    int x;
    int y;
    A(int x,int y){
    System.out.println(this.x=x);
    System.out.println(this.y=y);
    }
    A(){}
}
public class arrayex2 {
    public static void main(String args[]){
    A obj1=new A(10,20);
    A obj2=new A(20,30);
    A obj3=new A(30,40);
    A obj4=new A();
    obj4.x=obj1.x + obj2.x+obj3.x;
    obj4.y=obj1.y+obj2.y+obj3.y;
    System.out.println(obj4.x);
    System.out.println(obj4.y);
    
    }
    
}
