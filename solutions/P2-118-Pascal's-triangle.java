class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows <= 0) return triangle;

        
        triangle.add(new ArrayList<>(List.of(1)));

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>(i + 1);
            row.add(1); 

            for (int j = 1; j < i; j++) {
                row.add(prev.get(j - 1) + prev.get(j));
            }

            row.add(1); 
            triangle.add(row);
        }

        return triangle;
    }
}

