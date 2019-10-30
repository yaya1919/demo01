public class Level1 {
    public static void main(String[] args) {
        System.out.println("----input----");
        System.out.println("数组a:");
        int[][] a = {{1, 2}, {1, 2}, {1, 2}};
        int[][] b = {{1, 2, 3,}, {1, 2, 3,}};
        for (int[] item : a) {
            for (int i : item) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        System.out.println("数组b:");
        for (int[] value : b) {
            for (int i : value) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        System.out.println("----output----");
        int[][] c = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < b.length; k++) {
                    c[i][j] += (a[i][k] * b[k][j]);
                }
        }
        for (int[] ints : c) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}












