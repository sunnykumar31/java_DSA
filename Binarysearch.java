import java.util.Scanner;
public class Binarysearch {
    boolean search_byloop(int[] arr,int ele){
        int length=arr.length;
        int l=0;
        int r=length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==ele){
                System.out.println("found and index is "+mid);
                return true;
            }
            else{
                if(arr[mid]<ele){
                    l=mid+1;
                    
                }
                else{
                    r=mid-1;
                }
            }
        }
        System.out.println("not found");
        return false;
    }
    boolean search_byrecursion(int arr[],int ele,int l,int r){
        if(l>r){
            System.out.println("Not found");
            return false;
        }
        int mid=(l+r)/2;
        if(arr[mid]==ele){
            System.out.println("found and index is "+mid);
            return true;
        }
        if(arr[mid]<ele){
            l=mid+1;
            return search_byrecursion(arr,ele,l,r);
        }
        r=mid-1;
        return search_byrecursion(arr,ele,l,r);
        
    }
    public static void main(String args[]){
        Binarysearch obj=new Binarysearch();
        Scanner sc=new Scanner(System.in);
        int arr[]={5,10,15,20,25,30};
        System.out.println("Enter the element that you want to search");
        int srchele=sc.nextInt();
//        obj.search_byloop(arr,srchele);
        obj.search_byrecursion(arr,srchele,0,arr.length-1);
        
    }
}
