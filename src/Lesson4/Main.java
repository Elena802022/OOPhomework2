package Lesson4;
/*Создать класс Юзер и перенести его в базовые поля (ФИО)
        - Модифицировать ранее созданный класс СтудентКомпаратор
        - Переименовать в ЮзерКомпаратор
        - Типизировать его T наследующегося от типа Юзер
        - Типизировать реализуемый интерфейс Компаратор T
        - Изменить метод компаре, внеся во входные данные вместо конкретных классов типизацию T
        - Внести правки места, где использовался предыдущий компаратор*/
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> students = new ArrayList<>();
        User student1 = new User("Ivan", "Ivanov");
        User student2 = new User("Vladimir", "Petrov");
        User student3 = new User("Kitty", "Monson");

        students.add(student1);
        students.add(student2);
        students.add(student3);


        students.sort(new UserComparator<>());
        System.out.println(students);

        for (User user : students) {
            System.out.println(user.getLastName());
        }

        Dog dog1 = new Dog("Sharik", 5);
        Dog dog2 = new Dog("Bobik", 3);
        Dog dog3 = new Dog("Jassy", 4);

        List<Dog> dogs = new ArrayList<>(List.of(dog1, dog2, dog3));

        dogs.sort(new UserComparator<Dog>());
        System.out.println(dogs);


    }
}
