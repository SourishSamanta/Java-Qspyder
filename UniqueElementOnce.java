public class UniqueElementOnce{
    static int findUnique(int arr[]){
        
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for(int j = 0; j < arr.length; j++){
                if(i!=j && arr[i] == arr[j]){
                    flag = 1;
                    
                }
            }

            if(flag == 0 ){
                return arr[i];
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,3,2,1,4,1,5};
        int ans = findUnique(arr);
        System.out.println("Ans:"+ans);
    }
}