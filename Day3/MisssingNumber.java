package Day3;
import java.util.*;
public class MisssingNumber {
public static void main(String[] args) {
    int arr[]={9,6,4,2,3,5,7,0,1};
    int n=arr.length;
    int hasharr[]=new int[n+1];
    for(int i=0;i<n;i++){
        hasharr[arr[i]]++;
    }
    int missingnum=0;
    for(int i=0;i<n+1;i++){
        if(hasharr[i]==0){
         missingnum=i;
         break;
        }
    }
    System.out.print(missingnum);
    //Another approach without extra space
    //int sum=0;
    /**for(int i=0;i<n;i++){
     * sum=sum+arr[i];
     * }
     * int sumofnaturalnumbers=(n*(n+1)/2);
     * int missingnumber=sumofnaturalnumbers-sum; */
}
}
