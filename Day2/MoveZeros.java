package Day2;

public class MoveZeros {
public static void main(String[] args) {
    int arr[]={0,1,0,3,12};
    int n=5;
    int i=0;
    for(int j=1;j<n;j++){
        if(arr[i]==0 && arr[j]!=0){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          i++;
        }
        if(arr[i]!=0){
            i++;
        }
    }
    for(int j=0;j<n;j++){
        System.out.print(arr[j] +" ");
    }
}
}
