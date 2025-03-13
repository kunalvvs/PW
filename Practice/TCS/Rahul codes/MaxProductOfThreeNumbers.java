
import java.util.Arrays;

public class MaxProductOfThreeNumbers{

  public static int product(int nums[]){
    Arrays.sort(nums);
    int n = nums.length;
    return Math.max(nums[0]*nums[1]*nums[n-1],nums[n-1]*nums[n-2]*nums[n-3]);
  }
  public static void main(String[] args) {
      int[] nums = {-50, 1, 3, 8, -5};
      System.out.println("maximum product of three numbers is:" + " " +product(nums));
  }
}