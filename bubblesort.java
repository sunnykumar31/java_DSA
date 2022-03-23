
public class bubblesort {
    void sort_byloop(int[] arr){
        int temp;
        int l=arr.length;
        for(int i=0;i<l-1;i++){
            for(int j=0;j<l-i-1;j++){
                if(arr[j]>arr[j+1]){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
        
    }
    void sort_byrecursion(int[] arr){
        
    }
    public static void main(String args[]){
        bubblesort obj=new bubblesort();
        int arr[]={4,8,1,9,3,6,2,4};
        obj.sort_byloop(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
