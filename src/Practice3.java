public class Practice3 {
    public static void main(String[] args) {
        System.out.print("1~1000之间可以同时被3、5、7整除的数字：");
        for ( int  i=1;i<100;i+=3){
            if ((i % 3) == 0) {
                if (((i % 5) == 0) & ((i % 7) == 0)) {
                    System.out.print(" " + i);
                }
            }
        }
    }

}
