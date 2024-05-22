package SortingAlgorithms;
//Insertion sort
//Best case with the while loop
public class Insertionsort {
public static void main(String[] args) {
 int arr[]={1,7,4,5,2};
  int n=5;
  /*for(int i=0;i<n;i++){
    int j=i;
    while(j>0 && arr[j-1]>arr[j]){
        int temp=arr[j-1];
        arr[j-1]=arr[j];
        arr[j]=temp;
        j--;
    }
  }
  for(int i=0;i<n;i++){
    System.out.print(arr[i] +" ");
  }*/
  // Recursive Approach 
    recursiveinsertion(arr,1,n);
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
}
static void recursiveinsertion(int [] arr,int i, int k){
if(i==k){
  return;
}
int j=i;
while(j>0 && arr[j-1] >arr[j]){
int temp=arr[j-1];
arr[j-1]=arr[j];
arr[j]=temp;
j--;
}
i++;
recursiveinsertion(arr, i, k);
}
}
