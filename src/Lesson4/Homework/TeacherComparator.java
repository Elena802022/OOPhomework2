package Lesson4.Homework;

import java.util.Comparator;

class TeacherComparator <T extends Teacher> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getAge()- o2.getAge();
    }
}
