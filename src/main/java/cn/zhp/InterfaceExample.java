package cn.zhp;

/**
 * ClassName: InterfaceExample
 * Package: cn.zhp
 * Description:
 *
 * @Author 詹慧萍
 * @Create 2024/9/25 14:39
 * @Version 1.0
 */
public interface InterfaceExample {
    public static final int m=10;

    public abstract void fun();

    default void printFun(){
        System.out.println("这是一个接口的默认实现方法！");
    }
    public static void fun2(){
        System.out.println("这是一个静态方法！");
    }


}
