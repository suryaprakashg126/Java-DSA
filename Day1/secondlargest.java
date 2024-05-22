package Day1;

public class secondlargest {
public static void main(String[] args) {
    int arr[]={10,5,10};
    int n=3;
    int max=arr[0];
    int max2=-1;
    for(int i=0;i<n;i++){
        if(i>0 && arr[i]>max){
            max2=max;
            max=arr[i];
        }
        else if(arr[i]<max && arr[i]>max2){
            max2=arr[i];
        }
    }
    System.out.print(max +" "+max2);
}
}
