package cn.zhp;

/**
 * ClassName: ClassExample
 * Package: cn.zhp
 * Description:
 *
 * @Author 詹慧萍
 * @Create 2024/9/25 14:12
 * @Version 1.0
 */
public class ClassExample {
    public static void main(String[] args){
        System.out.println("rt ClassLoader:"+String.class.getClassLoader());
        System.out.println("ext ClassLoader:"+sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader());
        System.out.println("application ClassLoader:"+ClassExample.class.getClassLoader());
    }
}
