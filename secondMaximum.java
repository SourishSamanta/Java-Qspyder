class secondMaximum{
    public static int secondMax(int arr[]){
        int max=0;
        int smax=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }
            else if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];
            }
        }
        return smax;
    }
    public static void main(String[] args) {
        int arr[] = {-10,-50,-20,-2};
        System.err.println(secondMax(arr));
    }
}