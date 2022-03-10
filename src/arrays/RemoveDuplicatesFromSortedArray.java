package arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length==1){
            return 1;
        }
        int count=0;
        int previousUptoDate=0;
        int old=0;
        int newOne=1;
        while(newOne<nums.length){
            if(nums[old]!=nums[newOne]){
                nums[++previousUptoDate]=nums[newOne];
                count++;
                old=newOne;
            }
            newOne++;
        }
        return ++count;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
