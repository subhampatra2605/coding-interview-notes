# Two Sum

[LeetCode Link](https://leetcode.com/problems/two-sum/)

## Problem Statement

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.
You may assume that each input would have **exactly one solution**, and you may not use the same element twice.
The answer can be returned in any order.

---

## Brute Force Approach

* Iterate over every pair `(i, j)` where `i < j`.
* Check if `nums[i] + nums[j] == target`.
* If yes, return `{i, j}`.

**Time Complexity**: O(n²) – nested loops over array.
**Space Complexity**: O(1) – no extra space used.

---

## Efficient Insight

* We can use a **hash map** to store each number’s value and its index as we iterate.
* For each number `x`, we check if `target - x` exists in the map.

  * If yes → return indices.
  * If no → store `x` in the map for future lookups.
* **Single pass** through the array.

**Time Complexity**: O(n) – each element processed once.
**Space Complexity**: O(n) – storing numbers in a hash map.

---

## Pattern

* **Pattern**: Hashing / Single-Pass Lookup.
* **Similar Problems**:

  * 3Sum (LeetCode 15)
  * 4Sum (LeetCode 18)
  * Subarray Sum Equals K (LeetCode 560)

---

## Java Code – Brute Force

```java
public int[] twoSumBruteForce(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
                return new int[]{i, j};
            }
        }
    }
    return new int[]{}; // No solution found
}
```

---

## Java Code – Optimal (Hash Map)

```java
import java.util.HashMap;

public int[] twoSumOptimal(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[]{map.get(complement), i};
        }
        map.put(nums[i], i);
    }
    return new int[]{}; // No solution found
}
```

---

## Key Takeaways

* Hash maps are extremely effective for **pair-sum problems** in O(n) time.
* Always check the complement **before** inserting the current element to avoid using the same index twice.
* Brute force is simpler but unscalable for large input sizes.
