
public class Selectionsort {
    void sort(int[] arr){
        int l=arr.length;
        int temp=0;
        for(int i=0;i<l-1;i++){
            int min=i;
            for(int j=i+1;j<l;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            
        }
    }
    public static void main(String args[]){
        Selectionsort obj=new Selectionsort();
        int arr[]={8,4,90,70,45,20};
        obj.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
