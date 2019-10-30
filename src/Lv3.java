public class Lv3 {
    public static void main(String[] args) {
        int[] a = {123, 156, 187};
        int[] b = {145, 154, 199, 201};
        int[] c = new int[a.length + b.length];
        System.out.print("小本本1的内容：");
        for (int item : a) {
            System.out.print(" " + item); }
        System.out.println();
        System.out.print("小本本2的内容：");
        for (int value : b) {
            System.out.print(" " + value); }
        System.out.println();
        System.arraycopy(a, 0, c, 0, a.length);
        for (int i = a.length, j = 0; i < a.length + b.length; i++, j++) {
            c[i] = b[j]; }
        System.out.print("合并小本本的内容：");
        for (int value : c) System.out.print("  " + value);
        System.out.println();
        for (int i = 1; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (c[i] < c[j]) {
                    int temp = c[i];
                    c[i] = c[j];
                    c[j] = temp; } }
        }
            System.out.print("排序后的小本本内容：");
        for (int i : c) System.out.print(" " + i);
        System.out.println();
            for (int  z=0;z<c.length;z++){
                if (z==(c.length-1)/2){
                    System.out.println("妹子的门牌号内容："+c[z]); }
            }
                }
}








