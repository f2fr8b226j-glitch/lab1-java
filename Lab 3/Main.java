import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ===== Задание 1. Последовательность выполнения команд =====
        int x = 5;
        int y = 10;
        int z = 15;
        int sum = x + y + z;

        System.out.println("Задание 1:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("Сумма = " + sum);
        System.out.println();

        // ===== Задание 2. Арифметические операции =====
        int a = 20;
        int b = 4;

        System.out.println("Задание 2:");
        System.out.println("Сложение: " + (a + b));
        System.out.println("Умножение: " + (a * b));
        System.out.println("Деление: " + (a / b));
        System.out.println();

        // ===== Задание 3. Оператор присваивания =====
        int value = 10;
        value = value + 5;

        System.out.println("Задание 3:");
        System.out.println("Новое значение переменной: " + value);
        System.out.println();

        // ===== Задание 4. Ввод и вывод данных =====
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        int square = number * number;

        System.out.println("Квадрат числа: " + square);
        System.out.println();

        // ===== Задание 5. Площадь прямоугольника =====
        System.out.print("Введите длину прямоугольника: ");
        double length = scanner.nextDouble();

        System.out.print("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();

        double area = length * width;

        System.out.println("Площадь прямоугольника: " + area);
        System.out.println();

        // ===== Дополнительные задания =====

        // 1. Сумма и среднее арифметическое двух чисел
        System.out.print("Введите первое число: ");
        double n1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double n2 = scanner.nextDouble();

        double sum2 = n1 + n2;
        double average = sum2 / 2;

        System.out.println("Сумма: " + sum2);
        System.out.println("Среднее арифметическое: " + average);
        System.out.println();

        // 2. Площадь и периметр прямоугольника
        double rectArea = length * width;
        double rectPerimeter = 2 * (length + width);

        System.out.println("Площадь прямоугольника: " + rectArea);
        System.out.println("Периметр прямоугольника: " + rectPerimeter);
        System.out.println();

        // 3. Площадь круга
        final double PI = 3.14;

        System.out.print("Введите радиус круга: ");
        double radius = scanner.nextDouble();

        double circleArea = PI * radius * radius;

        System.out.println("Площадь круга: " + circleArea);
        System.out.println();

        // 4. Перевод температуры из Цельсия в Фаренгейт
        System.out.print("Введите температуру в Цельсиях: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.println("Температура в Фаренгейтах: " + fahrenheit);
        System.out.println();

        // 5. Расстояние при равномерном движении
        System.out.print("Введите скорость (v): ");
        double speed = scanner.nextDouble();

        System.out.print("Введите время (t): ");
        double time = scanner.nextDouble();

        double distance = speed * time;

        System.out.println("Пройденное расстояние: " + distance);
        System.out.println();

        // 6. Квадрат и куб числа
        System.out.print("Введите число: ");
        double num = scanner.nextDouble();

        double numSquare = num * num;
        double numCube = num * num * num;

        System.out.println("Квадрат числа: " + numSquare);
        System.out.println("Куб числа: " + numCube);
    }
}
