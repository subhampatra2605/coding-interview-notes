## Brute Force
- **Idea:** Generate all permutations of the array, sort them lexicographically, locate the current one, and take the next (or wrap to the first).  
- **Time:** O(n! * n) — factorial explosion.  
- **Space:** O(n! * n) to store permutations.  
- **Why impractical:** Not in-place, too slow for moderate n.

## Efficient Insight
- Find the rightmost pivot where `nums[i] < nums[i+1]` (first ascent from right).  
- Swap it with the smallest number larger than it to its right.  
- Reverse the suffix after the pivot to get the minimal tail.  
- If no pivot (array is non-increasing), reverse entire array.

## Pattern
- **Suffix/pivot manipulation** — identify change point and minimally increment.  
- **Two-phase:** detect pivot & successor, then reorder tail (reverse).  
- **In-place transformation** with constant extra space
