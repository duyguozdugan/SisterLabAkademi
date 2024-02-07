public class Solution {
    public int missingNumber(int[] nums) {
        int gecici=0;
        int sonuc=0;
        for(int i = 0; i < nums.length-1; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                if(nums[j] < nums[i]) {
                    gecici = nums[i];
                    nums[i] = nums[j];
                    nums[j] = gecici;
                }
            }
        }

        for(int i=0; i< nums.length;i++){
            if(i!=nums[i]) return i;
            else sonuc=i+1;
        }
        return sonuc;
    }
}
