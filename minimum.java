public class minimum {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 5, 8, 15 };
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {  
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The minimum value in the array is: " + min);
    }
} 