import java.util.*;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];

   
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array
        System.out.println("Original array is:");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
       System.out.println("Enter target:");
        int target = sc.nextInt();

     
        Solution obj = new Solution();


        int[] result = obj.twoSum(arr, target);

        System.out.println("Answer is: " + Arrays.toString(result));

        sc.close();
    }
}