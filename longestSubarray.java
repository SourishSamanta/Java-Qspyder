//To find longest subarray whose sum is <= target

public class longestSubarray{
    static int SumofSubarray(int arr[], int target){
        int max = Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++){
            int sum = 0;
            for(int j=i; j<arr.length;j++){
                sum += arr[j];
                if(sum<=target){
                    int len = j-i+1;
                    max = Math.max(max, len);
                    
                }
            }
        }
        return max; 
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2,1,1,5};
        int target = 5;
        int result = SumofSubarray(arr, target);
        System.out.println("The smallest subarray is of size:"+result);
    }
}