package Lesson4.Homework;

import java.util.Iterator;
import java.util.List;

public class TeacherIterator <T extends Teacher> implements Iterator<T> {

    public TeacherIterator(List<T> teacherList, int counter) {
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public T next() {
        return null;

    }
}
