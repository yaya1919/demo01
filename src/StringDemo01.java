public class StringDemo01 {
    public static void main(String[] args) {
        String str = "hello";
        byte b[] = str.getBytes();
        System.out.println(new String(b));
        System.out.println(new String(b, 1, 3));
    }
}
