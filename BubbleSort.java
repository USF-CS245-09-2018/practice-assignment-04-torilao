public class BubbleSort implements SortingAlgorithm {
    public void sort(int[] a){
        int temp;

        for(int i = 0; i < a.length - 1; i++){
            for(int j = a.length - 1; j > i; j--){
                if(a[j] < a[j - 1]){
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j - 1] = temp;
                }
            }
        }
    }
}
