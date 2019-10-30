public class ArrayCopyDemo01 {
    public static void main(String[] args) {
        int[]i1={1,2,3,4,5,6,7,8,9};
        int[]i2={11,22,33,44,55,66,77,88,99};
        Object copy;
        copy(i1,2,i2,2,4);
        final Object print = print(i2);
    }
        private static void copy(int[] i1, int i, int[] i2, int i3, int i4) {
        for (int j = 0; j <i4 ; j++) {
            i2[i3+j]=i1[i4+j];

        }
    }
    public  static Object print(int[] temp){
        for (int i = 0; i <temp.length ; i++) {
            System.out.print(temp[i]+"\t" + "");

        }
        return null;
    }
    }
