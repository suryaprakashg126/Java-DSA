package SortingAlgorithms;
// Divide && Merge the array
public class MergeSort {
public static void main(String[] args) {
    int arr[]={3,5,2,9,0};
    int n=5;
    mergesort(arr,0,n-1);
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}
static void mergesort(int [] arr ,int low, int high){
if(low==high){
    return;
}
int mid=(low+high)/2;
mergesort(arr, low, mid);
mergesort(arr, mid+1, high);
merge(arr,low,mid,high);
}
static void merge(int arr[], int l , int m, int h){
    int temp[]=new int[h-l+1];
    int k=0;
     int left=l;
     int right=m+1;
     while(left<=m && right<=h){
        if(arr[left]<=arr[right]){
            temp[k]=arr[left];
            left++;
        }
        else{
            temp[k]=arr[right];
            right++;
        }
        k++;
     }
     while(left<=m){
        temp[k]=arr[left];
        left++;
        k++;
     }
     while(right<=h){
        temp[k]=arr[right];
        right++;
        k++;
     }
     for(int i=0;i<k;i++){
        arr[l+i]=temp[i];
     }
}
}
