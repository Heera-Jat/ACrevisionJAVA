public class rough {
    public static void print(int [] nums) {
        for(int i =0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
    public static void main(String[] args) {
        int nums[] = {3,4,9,5,1,0,2};
        for(int i =0; i<nums.length; i++){
            int minPoss=i;
            for(int j =i+1; j<nums.length; j++){
                if(nums[minPoss] > nums[j]){
                    minPoss = j;
                }
            }
            int temp = nums[minPoss];
            nums[minPoss] = nums[i];
            nums[i] = temp;        
        } 
        print(nums);
    }
}
