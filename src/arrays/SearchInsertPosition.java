package arrays;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int ans=0;
        ans=bst(nums,target,0,nums.length-1);
        return ans;
    }
    public static int bst(int[] nums,int target,int i, int j){
        int mid=(i+j)/2;
        while(i<=j){
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                i=mid+1;
            }
            else if (nums[mid]>target){
                j=mid-1;
            }
            mid=(i+j)/2;
        }
        return j+1;
    }

    public static void main(String[] args) {
        System.out.println(new SearchInsertPosition().bst(new int[]{1,3,5,6},1,0,3));
    }

}
