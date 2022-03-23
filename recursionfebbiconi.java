import java.util.Scanner;
public class recursionfebbiconi {
    int febi(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return febi(n-1)+febi(n-2);
        }
    }
    public static void main(String args[]){
        recursionfebbiconi obj=new recursionfebbiconi();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of element");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(obj.febi(i)+" ");
        }
    }
}
