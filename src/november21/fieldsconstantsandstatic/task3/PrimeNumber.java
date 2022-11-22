package november21.fieldsconstantsandstatic.task3;

public class PrimeNumber {

    private final int[] primeNumbers = new int[10]; // Замечание. Вообще должен быть класс-хранилище.

    PrimeNumber() {
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

    public int[] getPrimeNumbers() {
        return primeNumbers;
    }
}
