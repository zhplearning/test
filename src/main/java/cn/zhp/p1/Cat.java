package cn.zhp.p1;

/**
 * ClassName: Cat
 * Package: cn.zhp.p1
 * Description:
 *
 * @Author 詹慧萍
 * @Create 2024/9/25 8:51
 * @Version 1.0
 */
public class Cat extends Animal{

    public Cat(String name,int age){
       // super(name,age);
        setName(name);
        setAge(age);
    }


    @Override
    public void eat(){
        System.out.println("年龄为："+getAge()+"的"+getName()+"小猫吃的是猫粮！");
    }
}
