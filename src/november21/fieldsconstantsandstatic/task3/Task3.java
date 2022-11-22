package november21.fieldsconstantsandstatic.task3;

import java.util.Scanner;

/**
 * Используя задачу <a href="https://github.com/KFalcon2022/practical-tasks/blob/master/src/lesson7_varargs_overloading/Task5.java">...</a>
 * (можете сделать на основе своего решения, но для наглядности удобства
 * новых возможностей рекомендую взять за основу решение по ссылке):
 * <p>
 * 1. Вынесите поиск простых чисел в отдельный класс.
 * <p>
 * 2. Реализуйте возможность вывода на экран суммы N первых простых чисел,
 *    где N – число, введенное пользователем с клавиатуры;
 * <p>
 * 3. Вынесите нужные вам переменные в поля класса.
 * Если необходимо – сделайте их константами уровня класса или объекта.
 * Помните, константа ссылочного типа гарантирует неизменность ссылки, а не содержимого объекта. Массив – ссылочный тип.
 * <p>
 * Примечание: это одна задача, а не различные варианты:)
 */

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PrimeNumber primeNumber = new PrimeNumber();
        
        printNPrimeNumbers(scanner.nextInt(), primeNumber.getPrimeNumbers());

        printSum(primeNumber.getPrimeNumbers());
    }

    public static void printNPrimeNumbers(int n, int[] primeNumbers) { // Замечание. Принт не ответственность класса PrimeNumber, выносим его сюда.
        //Доработать механизм увеличения размера массива к n
        if (n < 1 || n > 10) {
            System.out.println("N должно быть 10 >= N >= 1");
        } else {
            for (int i = 0; i <= n - 1; i++) {
                System.out.println(primeNumbers[i]);
            }
        }
    }

    public static void printSum(int[] primeNumbers) {
        System.out.println("Sum = " + sum(primeNumbers));
    }

    private static int sum(int[] numbers) {
        return sum(numbers, 0);
    }

    private static int sum(int[] numbers, int i) {
        if (i == numbers.length - 1) {
            return numbers[i];
        }
        return numbers[i] + sum(numbers, i + 1);
    }
}