package SortingAlgorithms;
// Take the pivot from the array
// push the elements on the left as smallest..
// push the elements on the right as largest .. Repeat.
// Divide and conquer Algorithm
public class QuickSort {
public static void main(String[] args) {
    int arr[]={4,1,3,9,7};
    int n=5;
    quicksort(arr, 0, n-1);
    for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");
    }
}
static void quicksort(int arr[], int low, int high){
    if(low>=high){
        return;
    }
    int pivot=func(arr, low, high);
    quicksort(arr, low, pivot-1);
    quicksort(arr, pivot+1, high);
}
static int func(int arr[],int low, int high){
    int pivot=low;
    int i=low;
    int j=high;
    while(i<j){
        while(arr[i]<=arr[pivot] && i<=high-1){
            i++;
        }
        while(arr[j]>arr[pivot] && j>=low-1){
            j--;
        }
        if(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    int temp=arr[low];
    arr[low]=arr[j];
    arr[j]=temp;
return j;
}
}
