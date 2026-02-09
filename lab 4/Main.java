import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ===== Задание 1. Нахождение суммы чисел от 1 до N =====
        System.out.print("Введите число N: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i; // Прибавляем каждое число
        }

        System.out.println("Сумма чисел от 1 до " + n + ": " + sum);
        System.out.println();

        // ===== Задание 2. Вывод чётных чисел =====
        System.out.println("Чётные числа от 1 до 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) { // Проверка на чётность
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println();

        // ===== Задание 3. Нахождение факториала =====
        System.out.print("Введите число для вычисления факториала: ");
        int m = scanner.nextInt();
        long factorial = 1;

        for (int i = 1; i <= m; i++) {
            factorial *= i; // Вычисление факториала
        }

        System.out.println("Факториал числа " + m + ": " + factorial);
        System.out.println();

        // ===== Задание 4. Вывод повторяющихся символов (с использованием while) =====
        System.out.print("Введите символ для повторений: ");
        char symbol = scanner.next().charAt(0);

        System.out.print("Сколько раз повторить символ: ");
        int repeat = scanner.nextInt();
        int count = 0;

        System.out.println("Повторяющиеся символы:");
        while (count < repeat) {
            System.out.print(symbol + " ");
            count++;
        }
        System.out.println();
        System.out.println();

        // ===== Задание 5. Нахождение нечётных чисел от 1 до 100 (использование do-while) =====
        int i = 1;
        System.out.println("Нечётные числа от 1 до 100:");

        do {
            if (i % 2 != 0) { // Проверка на нечётность
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 100);
        System.out.println();
        System.out.println();

        // ===== Задание 6. Ввод чисел пользователем и нахождение их суммы (завершение цикла по условию) =====
        int sumUntilZero = 0;
        int number;

        System.out.println("Введите числа для суммирования (для завершения введите 0):");

        do {
            number = scanner.nextInt();
            sumUntilZero += number; // Прибавляем каждое введённое число
        } while (number != 0); // При вводе 0 цикл завершается

        System.out.println("Сумма введённых чисел: " + sumUntilZero);
        System.out.println();

        // ===== Самостоятельные задачи =====

        // 1. Определить, является ли число положительным, отрицательным или равным нулю
        System.out.print("Введите целое число: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Число положительное.");
        } else if (num < 0) {
            System.out.println("Число отрицательное.");
        } else {
            System.out.println("Число равно нулю.");
        }
        System.out.println();

        // 2. Определить оценку студента по пятибалльной шкале
        System.out.print("Введите балл (0-100): ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("Оценка: 5");
        } else if (score >= 70) {
            System.out.println("Оценка: 4");
        } else if (score >= 50) {
            System.out.println("Оценка: 3");
        } else {
            System.out.println("Оценка: 2");
        }
        System.out.println();

        // 3. Сравнить два числа
        System.out.print("Введите первое число: ");
        int first = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int second = scanner.nextInt();

        if (first > second) {
            System.out.println("Первое число больше второго.");
        } else if (first < second) {
            System.out.println("Второе число больше первого.");
        } else {
            System.out.println("Числа равны.");
        }
        System.out.println();

        // 4. Определить день недели по номеру
        System.out.print("Введите номер дня недели (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Некорректный номер дня.");
        }
        System.out.println();

        // 5. Проверить, является ли число чётным или нечётным
        System.out.print("Введите число для проверки на чётность: ");
        int checkNum = scanner.nextInt();

        if (checkNum % 2 == 0) {
            System.out.println("Число чётное.");
        } else {
            System.out.println("Число нечётное.");
        }
        System.out.println();

        // 6. Определить, может ли пользователь получить доступ к системе на основе возраста
        System.out.print("Введите возраст пользователя: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Доступ разрешён.");
        } else {
            System.out.println("Доступ запрещён.");
        }
        System.out.println();

        // 7. Количество дней в месяце
        System.out.print("Введите номер месяца (1-12): ");
        int month = scanner.nextInt();

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 день.");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 дней.");
                break;
            case 2:
                System.out.println("28 или 29 дней.");
                break;
            default:
                System.out.println("Некорректный номер месяца.");
        }
        System.out.println();

        // 8. Определить состояние температуры
        System.out.print("Введите температуру: ");
        int temperature = scanner.nextInt();

        if (temperature <= 0) {
            System.out.println("Холодно");
        } else if (temperature <= 25) {
            System.out.println("Тепло");
        } else {
            System.out.println("Жарко");
        }
        System.out.println();

        // 9. Проверить, попадает ли число в диапазон
        System.out.print("Введите число для проверки диапазона (1-100): ");
        int rangeCheck = scanner.nextInt();

        if (rangeCheck >= 1 && rangeCheck <= 100) {
            System.out.println("Число в диапазоне.");
        } else {
            System.out.println("Число не в диапазоне.");
        }
        System.out.println();

        // 10. Операции с двумя числами
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка! Деление на ноль.");
                    return;
                }
                break;
            default:
               
