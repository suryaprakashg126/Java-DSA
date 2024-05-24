package Day3;

public class Singleone {
public static void main(String[] args) {
    int arr[]={2,2,1};
    int n=arr.length;
    int var=0;
    for(int i=0;i<n;i++){
        int flag=0;
        for(int j=0;j<n;j++){
            if(i!=j && arr[i]==arr[j]){
                flag=1;
                break;
            }
        }
        if(flag==0){
            var=arr[i];
        }
    }
    System.out.print(var);
}
}
