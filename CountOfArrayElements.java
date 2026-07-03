public class CountOfArrayElements{
     
    public static int getCount(int arr[],int target){
        int count=0;

            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==target){
                    count++;
                }
                
            }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,20,40,20,10};

        for (int i = 0; i < 10; i++) {
            System.out.println("Count of "+arr[i]+": "+getCount(arr, arr[i]) );
        }

    }
}