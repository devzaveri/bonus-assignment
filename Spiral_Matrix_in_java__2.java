import java.util.*;
public class Spiral_Matrix_in_java__2 {
    
    public static int[][] CreateSpiralMatrix(int n) {
      Scanner in = new Scanner(System.in);
      int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
      int count = 1;
      int T = 0;
      int B = n - 1;
      int L = 0;
      int R = n - 1;
      
      while (T <= B && L <= R) {
        for (int i = L; i <= R; i++) {
          matrix[T][i] = count++;
        }
        T++;
        for (int i = T; i <= B; i++) {
          matrix[i][R] = count++;
        }
        R--;
        for (int i = R; i >= L; i--) {
          matrix[B][i] = count++;
        }
        B--;
        for (int i = B; i >= T; i--) {
          matrix[i][L] = count++;
        }
        L++;
      }
      return matrix;
    }


    public static void PrintMatrix(int[][] matrix) {
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix.length; j++) {
          System.out.print(matrix[i][j] + "\t");
        }
        System.out.println();
      }
    }


    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        

        int[][] ans = CreateSpiralMatrix(n);
        PrintMatrix(ans);
    }
  }