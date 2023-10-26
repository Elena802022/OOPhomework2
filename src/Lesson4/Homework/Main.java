package Lesson4.Homework;
        /*Создать класс Учитель;
        Создать класс УчительГруппа и реализовать с параметризацией;
        Создать несколько несколько наследников класса учитель и использовать их с УчительГруппой*/

import Lesson4.Dog;
import Lesson4.User;
import Lesson4.UserComparator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Teacher>teachers = new ArrayList<>();
        Teacher teacher1 = new Teacher("Elena", "Ivanova", 35);
        Teacher teacher2 = new Teacher("Marina", "Petrovna", 37);
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.sort(new TeacherComparator<>());
        System.out.println(teachers);

        for (Teacher teacher : teachers) {
            System.out.println(teacher.getName());
        }

    }
}
