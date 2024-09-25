package cn.zhp.p2;

import cn.zhp.p1.Person;

/**
 * ClassName: Student
 * Package: cn.zhp.p2
 * Description:
 *
 * @Author 詹慧萍
 * @Create 2024/9/24 10:06
 * @Version 1.0
 */
public class Student extends Person {

//    public Student(String name, int age){
//        super(name,age);
//    }

    @Override
    public void print(){
        System.out.println("Student's name:"+getName()+",Student's age:"+getAge());
    }

}
