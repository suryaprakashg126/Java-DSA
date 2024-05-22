package Day1;
public class Removeduplicate {
public static void main(String[] args) {
    int arr[]={0,0,1,1,1,2,2,3,3,4};
    int n=10;
    int k=0;
    int temp[]=new int[n];
    String str[]=new String[n];
    for(int i=0;i<n-1;i++){
      if(arr[i]!=arr[i+1]){
        temp[k]=arr[i];
        str[k]=String.valueOf(arr[i]);
        k++;
      }
    }
    temp[k]=arr[n-1];
    str[k]=String.valueOf(arr[n-1]);
    if(k<=n){
    for(int i=k+1;i<n;i++){
       temp[i]=' ';
       str[i]="_";
    }
}
    for(int i=0;i<n;i++){
        System.out.print(str[i]+" ");
    }
}
}
