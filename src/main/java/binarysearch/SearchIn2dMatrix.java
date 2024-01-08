package binarysearch;

public class SearchIn2dMatrix {
    public boolean search(int[][] matrix, int target) {
        int rowSize = matrix.length;
        int columnSize = rowSize > 0 ? matrix[0].length : 0;
        if (rowSize == 0 || columnSize == 0) return false;
        int low = 0;
        int high = (rowSize * columnSize) - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int rows = mid / columnSize;
            int col = mid % columnSize;
            if (matrix[rows][col] == target) return true;
            if (matrix[rows][col] < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };
        int target = 7;
        SearchIn2dMatrix sea = new SearchIn2dMatrix();
        boolean result = sea.search(matrix, target);
        System.out.println(result);
    }
}

