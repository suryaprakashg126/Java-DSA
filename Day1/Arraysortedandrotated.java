package Day1;

public class Arraysortedandrotated {
public static void main(String[] args) {
    int arr[]={3,4,5,1,2};
    int n=5;
    int count=0;
    // checking if array is sorted by comparing the elements and rotated,
    //there count=1 or not count=0 will be there if it is already sorted.
    for(int i=0;i<n-1;i++){
        if(arr[i]>arr[i+1]){
          count++;
        }
    }
    // this is the special case - if the array is rotated last element will be small to first element.
    if(arr[n-1]>arr[0]){
        count++;
    }
    if(count<=1){
        System.out.print("true");
    }
    else{
        System.out.print("false");
    }

}
}
