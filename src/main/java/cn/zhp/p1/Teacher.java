package cn.zhp.p1;

/**
 * ClassName: Teacher
 * Package: cn.zhp.p1
 * Description:
 *
 * @Author 詹慧萍
 * @Create 2024/9/24 10:10
 * @Version 1.0
 */
public class Teacher extends Person{

    public Teacher(){
        super();
    }
    public Teacher(String name, int age) {
        super(name,age);
        //this.name=name;
        //this.age=age;

    }

    @Override
    public void print(){
        System.out.println("Teacher's name:"+name+",Teacher 's age:"+age);
    }
}
