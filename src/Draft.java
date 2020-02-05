

import java.util.Arrays;
import java.util.Random;

public class Draft {
    static void array(int[] S){
        for (int i = 0; i < S.length; i++) {
            System.out.print(S[i]+" ");
        }
        System.out.println("");
    }
    static void merge(int[] S1, int[] S2, int[] S){
        int i=0, j=0;
        while(i+j<S.length){
            if(j==S2.length || (i<S1.length && S1[i]<S2[j])){
                S[i+j]=S1[i++];
            }else{
                S[i+j]=S2[j++];
            }
        }
    }
    static void mergeSort(int[] S){
        int n=S.length;
        int mid=n/2;
        if(n<2) return;
        int[] S1=Arrays.copyOfRange(S, 0, mid);
        int[] S2=Arrays.copyOfRange(S, mid, n);
        mergeSort(S1);
        mergeSort(S2);
        merge(S1, S2, S);
    }
    public static void main(String[] args) {
        int[] a={3,1,2,6,4,7};
        array(a);
        mergeSort(a);
        array(a);
    }
}
