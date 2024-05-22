package SortingAlgorithms;
// selection sort 
// sort the array elements in ascending order.
// push the minimum elements towards front.
// working with index value to take the minimum
public class selectionsort {
public static void main(String[] args) {
    int n=5;
    int arr[]={9,4,3,17,6};
 for(int i=0;i<=n-2;i++){
  int min=i;
  for(int j=i;j<=n-1;j++){
    if(arr[j]<arr[min]){
      min=j;
    }
    int temp=arr[i];
    arr[i]=arr[min];
    arr[min]=temp;
  }
 }
  for(int i=0;i<n;i++){
    System.out.print(arr[i] +" ");
  }
}
}
