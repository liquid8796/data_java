
package Search;

import Sort.MergeSort;

public class Binary {
    public static void main(String[] args) {
        int[] S=new int[]{1,3,8,9,15,20,18,17,7,4,0};
        MergeSort sort=new MergeSort();
        sort.mergeSort(S);
        int i=0;
        int j=S.length;
        int x=0;
        int tmp=(i+j)/2;
        MergeSort.array(S);
        while(i<j){
            if(S[tmp]==x){
                System.out.println("found x= "+x);
                break;
            }
            if(S[tmp]>x){
                j=tmp;
            }
            if(S[tmp]<x){
                i=tmp;
            }
            tmp=(i+j)/2;
        }
    }
}
