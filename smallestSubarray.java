//Find the length of smallest subarray whose sum is >= target
public class smallestSubarray{
    static int SumofSubarray(int arr[], int target){
        int min = Integer.MAX_VALUE;
        for(int i =0; i<arr.length;i++){
            int sum = 0;
            for(int j=i; j<arr.length;j++){
                sum += arr[j];
                if(sum>=target){
                    int len = j-i+1;
                    min = Math.min(min, len);
                    break;
                }
            }
        }
        return min; 
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,2,4,3};
        int target = 7;
        int result = SumofSubarray(arr, target);
        System.out.println("The smallest subarray is of size:"+result);
    }
}