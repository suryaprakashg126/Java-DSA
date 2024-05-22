package SortingAlgorithms;
// pushing the Mx elements by adjacent checks.
public class BubbleSort {
public static void main(String[] args) {
    int arr[]={12,4,65,0,11,76};
    int n=6;
    /**for(int i=n-1;i>=0;i--){
        // hint --> i-1 if we put simply i it will throw the run time exception in nextline arr[j+1] 
        //which is we try to get element out of array
        for(int j=0;j<=i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }**/
    // Recursive Approach.
         bubblesort(arr,0,n-1);  
         for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
         }  
}
static void bubblesort(int []arr,int j, int k){
    if(k==1){
        return;
    }
    if(j==k){
        return;
    }
    if(arr[j]>arr[j+1]){
    int temp=arr[j];
    arr[j]=arr[j+1];
    arr[j+1]=temp;
    }
    j++;
    bubblesort(arr, j, k);
    k--;
    j=0;
    bubblesort(arr,j,k);
}
}
