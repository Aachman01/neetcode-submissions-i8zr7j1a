class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char number = board[r][c];
                
                // Skip empty cells
                if (number != '.') {
                    // Try to add the number in three different "scopes"
                    // If any .add() returns false, it means the string already exists (duplicate)
                    if (!seen.add(number + " in row " + r) ||
                        !seen.add(number + " in col " + c) ||
                        !seen.add(number + " in box " + (r / 3) + "-" + (c / 3))) {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}
