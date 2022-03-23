
public class Insertionsort {
    void sort(int arr[]){
        int l=arr.length;
        for(int i=1;i<l;i++){
            int j=i-1;
            int value=arr[i];
            while(j>=0 && value<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=value;
        }
    }
    public static void main(String args[]){
        Insertionsort obj=new Insertionsort();
        int arr[]={8,4,90,70,45,20};
        obj.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

