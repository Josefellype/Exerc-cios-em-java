public class RevVetFor{
    public static void main(String[] args) {
        int nums[] = {1,2,4,7,3,5,6,10,12,8,9,13,11,14,18};

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    int aux = nums[i];
                    nums[i] = nums[j];
                    nums[j] = aux;
                }
            }
        }
        for(int i = nums.length - 2;i > 0; i--){
            for(int j = 13-i; j < nums.length-1; j++){
                if(i%2!=0){
                    int aux = nums[j];
                    nums[j] = nums[i];
                    nums[i] = aux;
                }
                if(nums[j]<nums[j+1]){
                    int aux = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = aux;
                } 
                if(nums[i]<nums[i-1]){
                    int aux = nums[i-1];
                    nums[i-1] = nums[i];
                    nums[i] = aux;
                }
            }
        }
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}