import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class Test0 {
    public static void main(String[] args) {
        String x= "Hello world!";
        System.out.println(x);
        String m = "1234";
        int i = Integer.parseInt(m);
        long l = Long.parseLong(m);
        float f = Float.parseFloat(m);
        double d = Double.parseDouble(m);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数！");
        Scanner in =  new Scanner(System.in);
        while(in.hasNextInt()){
            int num = in.nextInt();
            System.out.println("请输入一个字符串");
            String str = in.next();
            System.out.println("num="+num+",str="+str);
            System.out.println("请输入一个整数");
        }
    }
}
