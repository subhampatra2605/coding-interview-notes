# P2-118-Pascal's-triangle.md

## Brute Force
- Thought of solving by recognizing the pattern as the first and last element of each row has 1 and rest element j = j-1 + j from the prev row i.e i-1

## Efficient Insight
- Same

## Pattern
- ...

## Key Takeaways
- Pascal’s triangle grows row by row; row `i` has `i+1` elements.  
- First and last elements are always `1`.  
- Interior element at position `j` is `prev[j-1] + prev[j]`.  
- Build in O(numRows²) time; simple, no hidden complexity.
