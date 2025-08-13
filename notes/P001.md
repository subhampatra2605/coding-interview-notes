# 73. Set Matrix Zeroes — Notes

## Brute Force
- For each zero, zero its row and column immediately.  
- Time: O(m·n·(m+n)); wastefully repeated.  
- Space: O(1), but pollutes future checks.

## Efficient Insight
- Use first row and column as markers; separate flags for first row/col.  
- Two-pass: mark first, then apply; handle first row/col last.

## Pattern
- Marker / In-place Flags Pattern  
- Two-phase separation (detect → apply)

## Key Takeaways
- Don’t mutate immediately; mark then apply.  
- (0,0) overlaps so track first row/col separately.  
- Iterate inner matrix before touching row 0 / col 0.

