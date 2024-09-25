package cn.zhp.p1;

/**
 * ClassName: Animal
 * Package: cn.zhp.p1
 * Description:
 *
 * @Author 詹慧萍
 * @Create 2024/9/24 19:08
 * @Version 1.0
 */
public class Animal {

    private String name;
    private int age;

    public Animal(){}

//    public Animal(String name,int age){
//        System.out.println("Animal类有参构造方法");
//        this.name=name;
//        this.age=age;
//    }

    public void eat(){
        System.out.println("年龄为："+getAge()+"的"+getName()+"动物吃的是什么？");
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

}
