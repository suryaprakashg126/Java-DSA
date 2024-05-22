package Day1;

public class Arraysortedandrotated {
public static void main(String[] args) {
    int arr[]={3,4,5,1,2};
    int n=5;
    int count=0;
    for(int i=0;i<n-1;i++){
        if(arr[i]>arr[i+1]){
          count++;
        }
    }
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
