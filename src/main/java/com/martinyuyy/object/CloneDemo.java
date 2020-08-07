package com.martinyuyy.object;

/**
 * created date 2020/8/7 10:24
 *
 * @author maxiaowei
 */
public class CloneDemo {


    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest cloneTest = new CloneTest(12,"xiaoming",new Person(23));
        CloneTest c1 = (CloneTest) cloneTest.clone();
        cloneTest.setPerson(new Person(90));
        System.out.println(cloneTest);
        System.out.println(c1);
    }

}

class CloneTest implements Cloneable {
    private int age;

    private String name;

    private Person person;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public CloneTest(){

    }

    public CloneTest(int age, String name, Person person) {
        this.age = age;
        this.person = person;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "CloneTest{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", person=" + person +
                '}';
    }
}

class Person{

    private Integer age;

    public Person(Integer age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}