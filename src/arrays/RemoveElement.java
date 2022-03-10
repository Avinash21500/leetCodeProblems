package arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length==1){
            if (nums[0]==val){
                return 0;
            }
            return 1;
        }
        int count=0;
        int leftPlace=nums.length-1;
        while(leftPlace>=0 && nums[leftPlace]==val ){
            leftPlace--;
            count++;
        }
        int i=0;
        while (i<leftPlace){
            if (nums[i]==val){
                nums[i]=nums[leftPlace];
                nums[leftPlace]=val;
                leftPlace--;
                count++;
                while(leftPlace>=0 && nums[leftPlace]==val){
                    leftPlace--;
                    count++;
                }
            }
            i++;
        }
        return nums.length-count;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveElement().removeElement(new int[]{3,3},3));
    }
}
