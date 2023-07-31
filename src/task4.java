import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {

        //Task1
//        int temp=0;
//        int [] nums = {5,2,3,1};
//        System.out.print("Descending: ");
//        for (int i = 0;i<nums.length;i++)
//        {
//            System.out.print(nums[i] + " ");
//        }
//        for (int i = 0;i<nums.length;i++)
//        {
//            for (int j = i+1;j<nums.length;j++)
//            {
//                if(nums[i] > nums[j])
//                {temp = nums[i];
//                   nums[i] = nums[j];
//                   nums[j] = temp;
//                }
//            }
//
//        }
//        System.out.print("Ascending : ");
//        for(int i = 0;i<nums.length;i++)
//        {
//            System.out.print(nums[i] + " ");
//        }
        //Task2

        int temp=0;
        int [] nums = {3,4,-1,1};
//        System.out.print("Descending: ");
//        for (int i = 0;i<nums.length;i++)
//        {
//            System.out.print(nums[i] + " ");
//        }
        for (int i = 0;i<nums.length;i++)
        {
            for (int j = i+1;j<nums.length;j++)
            {
                if(nums[i] > nums[j])
                {temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }

        }
        for(int i = 0;i<nums.length;i++)
        {
           // System.out.println(nums[i] + " ");

            if(nums[i] < 0)
            {
                System.out.println("Negative: "+nums[i]);
            }
            if(nums[i] > 0)
            {
                System.out.println("Positive: "+nums[i]);
            }


        }


        public class SmallestMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Place nums[i] at its correct position
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {
        SmallestMissingPositive solution = new SmallestMissingPositive();

        // Example usage:
        int[] nums = {3, 4, -1, 1};
        int result = solution.firstMissingPositive(nums);
        System.out.println(result); // Output: 2
    }
}


    }}
