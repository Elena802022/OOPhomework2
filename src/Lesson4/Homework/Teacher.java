package Lesson4.Homework;
        /*— Создать класс Учитель;
        — Создать класс УчительГруппа и реализовать с параметризацией;
        — Создать несколько несколько наследников класса учитель и использовать их с УчительГруппой*/


public class Teacher {
    private final int age;
    String name;
    String surname;

    public Teacher(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;

    }
}
