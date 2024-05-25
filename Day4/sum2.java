package Day4;

import java.util.HashMap;

public class sum2 {
public static void main(String[] args) {
    int arr[]={2,7,11,15};
    int n=4;
    int target=9;
    // HashMap Approach time complexity-->o(n)
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<n;i++){
     map.put(arr[i],i);
    }
    int [] ar=new int[2];
    int j=0;
    for(int i=0;i<n;i++){
        int reminder=target-arr[i];
        if(map.containsKey(reminder) && map.get(reminder)!=i){
           ar[0]=map.get(reminder);
           ar[1]=i;
        }
    }
    for(int i=0;i<2;i++){
        System.out.print(ar[i]+" ");
    }
}
}
