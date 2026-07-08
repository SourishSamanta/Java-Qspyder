public class LinearSearch{
    static int Search(int arr[],int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
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