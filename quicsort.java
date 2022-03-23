
public class quicsort {
    int partition(int arr[],int l,int r){
        int i=l-1;
        for(int j=l;j<r;j++){
            if(arr[r]>arr[j]){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            } 
        }
        int temp1=arr[i+1];
        arr[i+1]=arr[r];
        arr[r]=temp1;
        return i+1;
    }
    void sort(int arr[],int l,int r){
        if(l>=r){
            return;
        }
        if(l<r){
            int pi=partition(arr,l,r);
            sort(arr,l,pi-1);
            sort(arr,pi+1,r);
        }
    }
    public static void main(String args[]){
        quicsort obj=new quicsort();
        int arr[]={9,6,3,10,4};
        int r=arr.length;
        obj.sort(arr,0,r-1);
        for(int i=0;i<r;i++){
            System.out.print(arr[i]+" ");
        }
        
        
        
    }
}
