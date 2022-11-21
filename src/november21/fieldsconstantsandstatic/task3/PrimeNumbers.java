package november21.fieldsconstantsandstatic.task3;

public class PrimeNumbers {

    private final int[] primeNumbers = new int[10];

    PrimeNumbers() {
        findPrimeNumbers();
    }

    private void findPrimeNumbers() {
        for (int i = 0; i < primeNumbers.length; i++) {
            if (i == 0) {
                primeNumbers[i] = 2;
            } else {
                int addingValue = i == 1 ? 1 : 2;
                int number = primeNumbers[i - 1] + addingValue;
                primeNumbers[i] = findNextPrimeNumber(number, primeNumbers, i);
            }
        }
    }

    public void printNPrimeNumbers(int n) {
        //Доработать механизм увеличения размера массива к n
        if (n < 1 || n > 10) {
            System.out.println("N должно быть 10 >= N >= 1");
        } else {
            for (int i = 0; i <= n - 1; i++) {
                System.out.println(primeNumbers[i]);
            }
        }
    }

    public void printSum() {
        System.out.println("Sum = " + sum(primeNumbers));
    }

    //    В данном случае, рекурсивно реализован вызов проверки для нового числа в рамках
    //    заполнения одного элемента массива
    private int findNextPrimeNumber(int number, int[] primeNumbers, int currentIndex) {
        boolean isPrime = isPrime(number, primeNumbers, currentIndex);

        if (isPrime) {
            return number;
        }

        number += 2;

        return findNextPrimeNumber(number, primeNumbers, currentIndex);
    }

    //    Метод проверки конкретного числа на то, является ли оно простым
    private boolean isPrime(int number, int[] primeNumbers, int currentIndex) {
        int j = 0;
        boolean isPrime = true;

        while (isPrime && j < currentIndex && number / primeNumbers[j] > 1) {
            if (number % primeNumbers[j] == 0) {
                isPrime = false;
            } else {
                j++;
            }
        }
        return isPrime;
    }

    //    Логика реализации удобного метода-обертки, по аналогии с предыдущей задачей
    private int sum(int[] numbers) {
        return sum(numbers, 0);
    }

    private int sum(int[] numbers, int i) {
        if (i == numbers.length - 1) {
            return numbers[i];
        }
        return numbers[i] + sum(numbers, i + 1);
    }
}
