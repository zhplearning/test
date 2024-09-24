package cn.zhp.p1;

/**
 * ClassName: Test1
 * Package: cn.zhp.p1
 * Description:
 *
 * @Author 詹慧萍
 * @Create 2024/9/24 10:12
 * @Version 1.0
 */
class Test1 {
    public static void main(String[] args){
        Person p1=new Teacher();
        Person p2=new Teacher("zhangsan",23);
        p1.print();
        p2.print();

    }
}
