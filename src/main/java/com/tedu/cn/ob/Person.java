package com.tedu.cn.ob;

public class Person {
    private String name;
    private char gender;
    private int age;
    private double height;
    private double weight;

    public Person(String name, char gender, int age, double height, double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * equals重写方法，比较的是两个对象的内容
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return this.age == p.age ? true : false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public String toString(){
        return this.name+":"+this.age+":"+this.gender+":"+this.height+":"+this.weight+":";
    }
}
