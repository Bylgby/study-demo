package com.martinyuyy.designpattern;

/**
 * created date 2020/9/1 11:50
 * <p>
 *
 * @author martinyuyy
 */
public enum EnumTest {
    Boy("boy", new Boy()),
    Girl("girl", new Girl());


    private String name;

    private Person person;

    EnumTest(String boy, Person person) {

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
}
