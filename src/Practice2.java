import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Practice2 {
    public static void main(String[] args) {
        int x = -3;
        System.out.println(x + "的反码是：" + ~x);

    int  m=2;
        System.out.println(m+"左移两位的内容："+(m<<2));
        System.out.println(m<<2);
        if (m%2==1){
            System.out.println("m是奇数！");
        }else{
            System.out.println("m是偶数！");
        }
        char  oper='*';
        switch (oper){
            case'+':{
                System.out.println("m+x="+(m+x));
                break;
            }
            case '-':{
                System.out.println("m-x="+(m-x));
                break;
            }
            case'*':{
                System.out.println("m*x="+(m*x));
                break;
            }
            case '/':{
                System.out.println("m/x="+(m/x));
                break;
            }
            default:{
                System.out.println("未知的操作！");
                break;
            }
        }

    }

}
