
public class Runningsum
{
        public static int[] runningSum(int[] nums) {
            int temp=0;
            int sum[]=new int[nums.length];
            for(int i=0;i<nums.length;i++)
            {
                sum[i]=temp+nums[i];
                temp=sum[i];
            }
            return sum;

        }
}


