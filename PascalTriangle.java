import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 3;
        List<List<Integer>> ans = generate(n);
        System.out.print(ans);
    }
    
    public static List<List<Integer>> generate(int numRows) {
        int n = numRows;
        int arr[][] = new int[n][];
    
        for(int line = 0; line < n; line++) {
            int row[] = new int[line + 1];
            row[0] = 1;
            row[line] = 1;
            for(int i = 1; i < line; i++) {
                row[i] = arr[line - 1][i - 1] + arr[line - 1][i];
            }
            arr[line] = row;
        }
        
        List<List<Integer>> result = new ArrayList<>();
        for(int[] row : arr) {
            List<Integer> listRow = new ArrayList<>();
            for(int i : row) {
                listRow.add(i);
            }
            result.add(listRow);
        }
        return result;
    }
}
