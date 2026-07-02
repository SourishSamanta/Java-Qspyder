//find the first and last position of a element in an array

public class FirstAndLastPosition{

    static int[] findPosition(int arr[],int target){
        
        int result[] = new int[2];
        for (int idx = 0; idx < arr.length; idx++) {
            if(arr[idx]==target){
                result[0] = idx;break;
            }
            
        }

        for (int idx = arr.length-1; idx >= 0 ; idx--) {
            if(arr[idx]==target){
                result[1] = idx;break;
            }
            
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {3,1,2,1,7,1,8};
        int target = 1;
        int inx[] = findPosition(arr, target);

        for (int i = 0; i < inx.length; i++) {
            System.err.print(inx[i] + " ");
        }
        
    }
}