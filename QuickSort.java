public class QuickSort {
    public static void main(String[] args) {
        int[] arr= {5,3,6,1,4,2};
        int n = arr.length;

        quicksort(arr,0,n-1);

        for(int i : arr){
            System.out.println(i + " ");
        }
    }
    public static void quicksort(int[] arr, int low, int high){
        if(low<high){
            int pi = findPivot(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }

    public static int findPivot(int[] arr,int low,int high){

        int pi = arr[high];
        int i = low-1;

        for(int j=low;j<high;j++){
            if(arr[j] < pi){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}
