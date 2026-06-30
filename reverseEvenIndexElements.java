public class reverseEvenIndexElements{
    public static void reverse(int arr[]){
        int size = arr.length-1;
        int i=0,j=size%2==0? size:size-1;
        while(i<j){
            
            if(i%2==0 && j%2==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            i++;j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        
        

        reverse(arr);

        

        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
     }
}