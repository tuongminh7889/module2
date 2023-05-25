import java.util.Map ;
import java.util.HashMap ;
public class test {
        public static void main(String[] args) {
            int[] array = {2, 7, 11, 15, 4, 13};
            twoSum(array,19);
        }
        public static int[] twoSum(int[] nums, int target) {

            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int expected = target - nums[i];
                if (map.get(nums[i]) != null) {
                    return new int[]{i, map.get(nums[i])};
                }
                System.out.println(String.valueOf(map.put(expected, i)));
            }

            return null;
        }
    }
