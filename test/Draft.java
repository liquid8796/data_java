

import Sort.*;
import java.util.Arrays;

public class Draft {
    public static void array(int[] S){
        for (int i = 0; i < S.length; i++) {
            System.out.print(S[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] S=new int[]{1,3,8,9,15,20,25,17,7,4,0};
        long startTime=System.nanoTime();    
        int n=S.length;
        int mid=n/2;
        if(S[mid-1]<S[mid] && S[mid]>S[mid+1]){
            System.out.println("length of array 1 is "+(mid+1));
            return;
        }
        if(S[mid-1]<S[mid] && S[mid]<S[mid+1]){
            for(int i=mid+1;i<n;i++){
                if(S[i]>S[i+1]){
                    System.out.println("length of array 1 is "+(i+1));
                    break;
                }
                return;
            }
        }
        if(S[mid-1]>S[mid] && S[mid]>S[mid+1]){
            for(int i=mid-1;i>0;i--){
                if(S[i]>S[i-1]){
                    System.out.println("length of array 1 is "+(i+1));
                    break;
                }
                return;
            }
        }
        long endTime=System.nanoTime();
        long elapsed=endTime-startTime;
        System.out.println("Time algorithm: "+elapsed);
    }
}
