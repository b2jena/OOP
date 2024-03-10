package TutortAcademy;

public class TransposeOfAMatrix {
    public static void main(String[] args) {
        int m = 3, n = 4;
        int[][] a = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(a[0].length + " " + a.length);
        transpose(a);
    }

    private static void transpose(int[][] a) {
        int[][] transpose = new int[a[0].length][a.length];
        // print a
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("######");
        // print transpose of a
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                transpose[j][i] = a[i][j];
            }
        }
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
