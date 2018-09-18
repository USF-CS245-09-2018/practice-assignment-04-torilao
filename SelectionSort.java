public class SelectionSort implements SortingAlgorithm{
    public void sort(int[] a){
        int low;
        int temp;

        for(int i = 0; i < a.length; i++){
            low = i;
            for(int j = i +1; j < a.length; j++){
                if(a[low] > a[j]){
                    low = j;
                }
            }
            temp = a[i];
            a[i] = a[low];
            a[low] = temp;
        }
    }
}
