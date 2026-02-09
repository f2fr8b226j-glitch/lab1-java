// Лабораторная работа №2
// Переменные, типы данных и наследование в Java

// Базовый класс
class Person {

    String name;
    int age;

    void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}

// Производный класс (наследование + переопределение)
class Student extends Person {

    String group;

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Группа: " + group);
    }
}

// Главный класс
public class Main {

    // поле класса (область видимости — весь класс)
    static int classVariable = 100;

    public static void main(String[] args) {

        // ===== Задача 1: Переменные и константы =====
        int a = 10;
        double b = 3.14;
        boolean flag = true;
        final int CONSTANT = 50;

        System.out.println("Переменная int: " + a);
        System.out.println("Переменная double: " + b);
        System.out.println("Переменная boolean: " + flag);
        System.out.println("Константа final: " + CONSTANT);

        System.out.println();

        // ===== Задача 2: Примитивные и ссылочные типы =====
        int number = 25;              // примитивный тип
        String text = "Java язык";    // ссылочный тип

        System.out.println("Примитивный тип int: " + number);
        System.out.println("Ссылочный тип String: " + text);

        System.out.println();

        // ===== Задача 3: Область видимости =====
        int localVariable = 20; // локальная переменная

        System.out.println("Переменная класса: " + classVariable);
        System.out.println("Локальная переменная: " + localVariable);

        System.out.println();

        // ===== Задачи 4–5: Наследование и полиморфизм =====
        Person person = new Student(); // полиморфизм

        person.name = "Иван";
        person.age = 20;
        ((Student) person).group = "ИС-2204";

        person.displayInfo(); // вызов переопределённого метода
    }
}
