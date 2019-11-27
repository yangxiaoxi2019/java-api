package com.tedu.cn.ob;

public class Driver {
    public static void main(String[] args) {
        Person person1=new Person("jack", 'M',38,175,75);
        Person person2=new Person("jack", 'M',38,175,75);
        System.out.println(person1.equals(person2));
        System.out.println(person1==person2);
        System.out.println(person1);
    }

}
