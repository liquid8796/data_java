package Sort;


public class InsertSort {
    
    public static void main(String[] args) {
        int[] a={3,1,2,6,4,7};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        for (int i = 1; i < a.length; i++) {
            int key=a[i];
            int j=i-1;
            while(j>=0 && key<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
