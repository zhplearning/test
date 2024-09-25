package cn.zhp.p1;

/**
 * ClassName: Dog
 * Package: cn.zhp.p1
 * Description:
 *
 * @Author 詹慧萍
 * @Create 2024/9/25 8:50
 * @Version 1.0
 */
public class Dog  extends Animal{

    public Dog(String name,int age){
        //super(name,age);
        setName(name);
        setAge(age);

    }

    @Override
    public void eat(){
        System.out.println("年龄为："+getAge()+"的"+getName()+"小狗吃的是狗粮！");
    }
}
