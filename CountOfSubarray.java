//Count of subarrays whose sum is < target

public class CountOfSubarray{
    static int SumofSubarray(int arr[], int target){
        int count = 0;
        for(int i =0; i<arr.length;i++){
            int sum = 0;
            for(int j=i; j<arr.length;j++){
                sum += arr[j];
                if(sum<target){
                    count++;
                    
                }
            }
        }
        return count; 
    }
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,2};
        int target = 7;
        int result = SumofSubarray(arr, target);
        System.out.println("The Count of subarrays is:"+result);
    }
}