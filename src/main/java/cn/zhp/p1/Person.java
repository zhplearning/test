package cn.zhp.p1;

/**
 * ClassName: Person
 * Package: cn.zhp.p1
 * Description:
 *
 * @Author 詹慧萍
 * @Create 2024/9/24 10:05
 * @Version 1.0
 */

public class Person {
    private String name;
    private int age;

    public Person(){}

//    public Person(String name,int age){
//        this.name=name;
//        this.age=age;
//    }

    public void print(){
        System.out.println("name:"+name+",age:"+age);
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
