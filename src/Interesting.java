import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Interesting {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите первое число: \n");

        scanConsoleAndMakeArray();
    }

    /*Эта функция поочередно берет вводимые в консоль int-ы и запихивает их также поочередно в массив для дальнейшей передачи
    в функцию sumPairsInArray. Но вот беда: в цикле массив заполняется, как и задумано, а после цикла он остается забитым
    нулями, как при его инициализации до цикла.*/
    static void scanConsoleAndMakeArray() throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            System.out.println(1);
        }
        sc.close();

        Scanner sc1 = new Scanner(System.in);
        sc1.next();
        System.out.println();
        sc1.close();
    }

    /*Эта функция будет брать уже заполненный массив из scanConsoleAndMakeArray и складывать соседние пары чисел массива,
    однако на данный момент она */

}
