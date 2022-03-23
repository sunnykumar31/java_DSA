import java.util.Scanner;
public class recursionfact {
    public int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return (n*fact(n-1));
        }
    }
    public static void main(String args[]){
        recursionfact obj=new recursionfact();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(obj.fact(n));
        
    }
}
