public class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        // 1. Find pivot: rightmost i where nums[i] < nums[i+1]
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // 2. If no pivot, it's highest permutation -> reverse all
        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // 3. Find rightmost successor to pivot (first > nums[pivot] from right)
        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        // 4. Reverse suffix after pivot to get smallest tail
        reverse(nums, pivot + 1, n - 1);
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private void reverse(int[] a, int l, int r) {
        while (l < r) {
            swap(a, l++, r--);
        }
    }
}
