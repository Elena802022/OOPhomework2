package Lesson4.Homework;
          /*Создать класс Учитель;
          Создать класс УчительГруппа и реализовать с параметризацией;
          Создать несколько несколько наследников класса учитель и использовать их с УчительГруппой*/


import java.util.Iterator;

public class EnglishTeacher extends Teacher implements TeacherGroup{
    public EnglishTeacher(String name, String surname, int age) {
        super(name, surname, age);
    }

}
