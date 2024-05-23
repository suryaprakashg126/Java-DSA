package Day2;

public class RotateArray {
public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7};
    // result ={5,6,7,1,2,3,4};
    int n=7;
    int k=3;
    int tempvar=0;
    // This code is will get 37/38 test cases passed, time limit exceed for larger arrays.
    //Brute force Approach
    /**int i=1;
    while(i<=k%n){
        tempvar=arr[n-1];
        for(int j=n-1;j>0;j--){
          arr[j]=arr[j-1];
        }
        arr[0]=tempvar;
        i++;
        System.out.print("Rotation:"+ i);
        for(int t=0;t<n;t++){
            System.out.print(" "+arr[t]+" ");
        }
        System.out.println();
    }**/
    // Optimal Approach by Reversing...
    k=k%n;
    // this operation denotes ex - if k=14 if dont have to perform same operations repeatedly 1,2,3,4,5,6,7 after 7 rotations it will be same , so
    // we take the reminder and perform the rotations.
reverse(arr,0,n-1);
reverse(arr,0,k-1);
reverse(arr,k,n-1);
for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
}
}
static void reverse(int []arr, int start, int end){
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
}
}
