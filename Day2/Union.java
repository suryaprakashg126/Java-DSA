package Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Unionintersection {
    public static void main(String[] args) {
int[] arr1={1,2,3,4,5};
int [] arr2={1,2,3,6,7,8};
HashSet<Integer> set=new HashSet<>();
ArrayList<Integer> arr=new ArrayList<>();
int n=5;
int m=6;
for(int i=0;i<n;i++){
set.add(arr1[i]);
}
for(int j=0;j<m;j++){
    set.add(arr2[j]);
}
for(Integer i:set){
    arr.add(i);
}
    Collections.sort(arr);
System.out.println(arr);
    }
}
