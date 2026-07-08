public class BinarySearch{
    static int Search(int arr[], int target){
        int st = 0;
        int end = arr.length - 1;
        while(st < end){
            int mid = (st + end)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid -1;
            }
            else{
                st = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {3,7,1,9,10,56};
        int item = Search(arr, 10);

        System.out.println("At index " + item);
    }
}