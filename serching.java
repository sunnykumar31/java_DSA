import java.util.Scanner;
public class serching {
    boolean search_element_Byrecursion(int[] arr,int ele,int index){
        int length=arr.length;
        if(index==length){
            System.out.println("not found");
            return false;
        }
        else{
            if(arr[index]==ele){
                System.out.println("element found");
                return true;
            }
            else{
                index++;
                return search_element_Byrecursion(arr,ele,index);
            }
        }
    }
    boolean search_element_byloop(int[] arr,int ele){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                System.out.println("element found");
                return true;
            }
        }
        System.out.println("element not found");
        return false;
    }
    public static void main(String args[]){
        serching obj =new serching();
        Scanner sc=new Scanner(System.in);
        int arr[]={6,8,9,10,12,20};
        System.out.println("enter element you want to search");
        int srchele=sc.nextInt();
//        obj.search_element_byloop(arr,srchele); 
        int index=0;
        obj.search_element_Byrecursion(arr, srchele,index);
    }
}
    