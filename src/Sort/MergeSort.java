package Sort;


import java.util.Arrays;
import java.util.Comparator;


public class MergeSort {
    public static void array(int[] S){
        for (int i = 0; i < S.length; i++) {
            System.out.print(S[i]+" ");
        }
        System.out.println("");
    }
    
    public static void merge(int[] S1, int[] S2, int[] S){
        int i=0, j=0;
        while(i+j<S.length){
            if(j==S2.length || (i<S1.length && S1[i]<S2[j])){
                S[i+j] = S1[i++];
            }else{
                S[i+j] = S2[j++];
            }
        }
    }
    public static void mergeSort(int[] S){
        int n=S.length;
        if(n<2) return;
        int mid=n/2;
        int[] S1=Arrays.copyOfRange(S, 0, mid);
        int[] S2=Arrays.copyOfRange(S, mid, n);
        mergeSort(S1);
        mergeSort(S2);
        merge(S1,S2,S);
    }
    
}
