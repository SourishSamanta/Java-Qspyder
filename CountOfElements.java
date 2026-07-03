public class CountOfElements{
     public static int countDigit(long n){
        int count = 0;
        while(n > 0){
            count++;
            n=n/10;
        }
        return count;
     }
    public static int getCount(long arr[],int target){
        int count=0;

            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==target){
                    count++;
                }
                
            }

        return count;
    }

    public static void main(String[] args) {
        long num = 111L;
        int n = countDigit(num);
        
        long arr[] = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = num % 10;
            num = num / 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Count of "+i+": "+getCount(arr, i) );
        }

    }
}