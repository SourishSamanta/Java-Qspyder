public class reverseHalf{

    public static void reverse(int arr[]){
        int i=0,j=arr.length -1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        
        int newArr[] = new int[arr.length%2==0 ? (arr.length/2) : (arr.length/2 +1)];

        for(int i=0;i<newArr.length;i++){
            newArr[i] = arr[i];
        }

        reverse(newArr);

        for(int i=0;i<newArr.length;i++){
            arr[i] = newArr[i];
        }

        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
     }
}